package ch05;

import java.util.Scanner;

public class GradeExam {
	// 성적표 버전2 만들기
	// 학생이름 테이블 -> String[]
	// 점수 테이블 -> byte[]
	// 총점 테이블 -> int[]
	// 평균 테이블 -> double[]

	public static void main(String[] args) { // 주메뉴 구현용

		Scanner mainsc = new Scanner(System.in);
		System.out.println("초기작업 : 학생수를 입력하세요");
		int count = mainsc.nextInt();

		String[] name = new String[count];
		byte[] engscores = new byte[count];
		byte[] korscores = new byte[count];
		int[] totalscores = new int[count];
		double[] avgscores = new double[count];

		boolean run = true;
		while (run) {
			System.out.println("=======MBC 교육센터 성적 관리 프로그램=======");
			System.out.println("1. 학생관리 | 2. 성적관리 | 3. 통계 | 4. 종료");
			System.out.println("=======================================");
			System.out.print(">>>  ");
			int select = mainsc.nextInt(); // 1~4까지 정수 입력 후에 분기설정

			switch (select) {
			case 1:
				System.out.println("학생관리 메서드로 진입합니다.");
				student(name);
				break;
			case 2:
				System.out.println("성적관리 메서드로 진입합니다.");
				sexual(engscores, korscores, name);
				break;
			case 3:
				System.out.println("통계 메서드로 진입합니다");
				statistics(totalscores, avgscores, korscores, engscores);
				break;
			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;
			} // switch 종료
		} // while 종료
	} // main 종료

	private static void statistics(int[] totalscores, double[] avgscores, byte[] engscores, byte[] korscores) {
		// 통계 CRUD
		System.out.println("학생별 총점과 평균, 등급을 확인합니다.");
		System.out.println("================================");
		for (int i = 0; i < totalscores.length; i++) {
			totalscores[i] = korscores[i] + engscores[i];
			avgscores[i] = totalscores[i] / 2;
			System.out.println(i + 1 + " 번 학생 총점 : " + totalscores[i] + "점 평균 : " + avgscores[i]+"점");
		}
		System.out.println("===============================");
		System.out.println("수정은 홈에서 성적관리에서 가능합니다.");

	} // 통계 종료

	private static void sexual(byte[] engscores, byte[] korscores, String[] name) {
		// 성적관리 CRUD
		Scanner sexualSC = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("==================성적관리메뉴==================");
			System.out.println("1. 등록 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 홈으로");
			System.out.println("=============================================");
			System.out.println(">>>    ");
			int select = sexualSC.nextInt();

			switch (select) {
			case 1:
				System.out.println("          점수를 등록합니다          ");
				System.out.println("=================================");
				for (byte i = 0; i < engscores.length; i++) {
					System.out.print(name[i]+ " 학생의 국어점수를 입력해 주세요 : ");
					korscores[i] = sexualSC.nextByte();
					System.out.print(name[i] + " 학생의 영어점수를 입력해 주세요 : ");
					engscores[i] = sexualSC.nextByte();
				}
				System.out.println("점수등록 완료.");
				break;

			case 2:
				System.out.println("학생별 점수 리스트 출력");
				System.out.println("=================================");
				for (int i = 0; i < engscores.length; i++) {
					System.out.println(name[i]+ " 학생 국어 : " + korscores[i] + "  영어 : " + engscores[i]);
				}
				break;

			case 3:
					System.out.println("학생 점수 수정");
					System.out.println("점수를 수정할 학생의 번호를 입력해주세요");
					int studentnum = sexualSC.nextInt();
					if (studentnum < korscores.length+1) {
						System.out.println("수정할 과목의 번호를 눌러주세요");
						System.out.println("1. 국어  | 2. 영어");
						int subject = sexualSC.nextInt();
						if (subject == 1) {
							System.out.print("수정하실 점수를 입력해주세요 : ");
							int scores = sexualSC.nextInt();
							if(scores > 100) {
								System.out.println("입력값을 초과하였습니다. 다시 입력해주세요");
								break;
							}else {
							korscores[studentnum - 1] = (byte) scores;
							System.out.println("점수 수정 완료");
							break;
							}
						} else if (subject == 2) {
							System.out.print("수정하실 점수를 입력해주세요 : ");
							int scores = sexualSC.nextInt();
							if(scores > 100) {
								System.out.println("입력값을 초과하였습니다. 다시 입력해주세요");
								break;
							}
							engscores[studentnum - 1] = (byte) scores;
							System.out.println("점수 수정 완료");
							break;
						} else if(2 < subject) {
							System.out.println("잘못 입력하셨습니다. 1~2번만 입력해주세요");
							System.out.println("====================================");

						} // 점수 수정 if 종료s
					} else{
						System.out.println("잘못 입력하셨습니다. 학생 번호를 확인해주세요.");
						System.out.println("========================================");
					} // 과목 번호 if 종료
				break;

			case 4:
				System.out.println("점수를 삭제하실 학생의 번호를 입력해주세요");
				int delete = sexualSC.nextInt();
				korscores[delete - 1] = 0;
				engscores[delete - 1] = 0;
				System.out.println("점수가 삭제되어 0점 처리되었습니다.");
				break;
				
			case 5:
				run = false;
				break;

			default:
				System.out.println("입력값 오류 : 1~4번만 입력해주세요");
			} // 성적관리 switch 종료
		} // 성적관리 while 종료

	} // 성적관리 종료

	private static String[] student(String[] name) {
		// 학생관리용 CRUD
		Scanner studentSC = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("==================학생관리메뉴==================");
			System.out.println("1. 등록 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 홈으로");
			System.out.println("=============================================");
			System.out.print(">>>   ");
			int select = studentSC.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생 등록을 시작합니다");
				System.out.println("총 학생수는 : " + name.length);

				for (int i = 0; i < name.length; i++) { // 학생이름 반복문
					System.out.println((i + 1) + "번 학생 이름을 등록하세요.");
					name[i] = studentSC.next(); // 키보드 문자로 받은 값을 배열 i에 넣는다
				}
				System.out.println("학생 등록 완료");
				break;
				
			case 2:
				System.out.println("학생 리스트 출력");
				System.out.println("=================================");

				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + " 번 :" + name[i]);
				}
				break;

			case 3:
				System.out.println("학생 이름 수정");
				System.out.print("수정할 학생 번호를 입력하세요 : ");
				int nameNum = studentSC.nextInt();

				System.out.print("수정할 학생 이름을 입력하세요 : ");
				String nameMOD = studentSC.next();

				name[nameNum - 1] = nameMOD;
				System.out.println("수정완료");
				break;

			case 4:
				System.out.print("삭제할 학생 번호를 입력하세요 : ");
				int deleteNum = studentSC.nextInt();
				name[deleteNum - 1] = null; // null은 객체 삭제에도 사용한다
				break;

			case 5:
				run = false;
				break;
				
			default:
				System.out.println("입력값 오류 : 1~4번 만 입력하세요");
			}// 학생관리 switch 종료

		} // while 종료
		return name;
	} // student 종료

} // class 종료
