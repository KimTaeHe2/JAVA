package ch06.ScoresCard;

import java.util.Scanner;

public class ScoresMainExam {
	// 필드 -> 멤버 변수로 main에서 사용할 배열이나 객체등을 생성
	private static Scanner input = new Scanner(System.in); // 현 class 내에 메서드에서 호출되어 사용함
	private static Student[] st = new Student[5]; // 학생 객체용으로 5칸 배열 생성
	// String[] string = new String[5];
	// 생성자 -> main일 경우 new 사용하지 않음(정적 static으로 사용하지 않음)

	// 메서드
	public static void main(String[] args) {
		// 주실행 클래스로 메뉴와 클래스.메서드 호출용으로 작업
		// 객체 : 학생, 성적, 통계.....
		boolean run = true; // 반복실행 시작
		while (run) { // 종료 run = false ;
			System.out.println("==========학생관리프로그램v2(객체)==========");
			System.out.println("1. 학생관리 | 2. 성적관리 | 3. 통계 | 4. 종료");
			System.out.println("=======================================");
			System.out.print(">>>");
			int select = input.nextInt(); // 객체 사용 전에 private static 확인 필수
			switch (select) {
			case 1:
				System.out.println("학생관리 클래스로 진입");
				boolean strun = true;
				while (strun) {
					System.out.println("1. 학생등록 | 2. 학생보기 | 3. 학생수정 | 4. 학생삭제 | 5. 뒤로가기");
					System.out.print(">>>");
					int stselect = input.nextInt();
					switch (stselect) {
					case 1:
						System.out.println("학생등록 메뉴입니다.");
						Student regStudent = new Student(); // 객체 생성
						System.out.print("이름 : ");
						regStudent.name = input.next(); // 키보드로 받은 이름
						System.out.print("학번 : ");
						regStudent.num = input.nextInt(); // 키보드로 받은 학번
						System.out.print("성별 : ");
						regStudent.sex = input.next(); // 키보드로 받은 성별
						System.out.print("학년 : ");
						regStudent.grade = input.nextInt(); // 키보드로 받은 학년
						System.out.print("반 : ");
						regStudent.classroom = input.nextInt(); // 키보드로 받은 반
						System.out.println("       빈칸 찾는중 ...");
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) { // st배열에 빈칸인지 찾음.
								st[i] = regStudent; // 위에 만든 객체를 넣음
								System.out.println("=====빈 객체 속 정보 저장 완료=====");
								break; // 저장 후 종료
							} // if 종료
						} // for 문 종료 null 을 찾음
						break; // 학생등록 용 정지

					case 2:
						System.out.println("====================================");
						System.out.println("1. 학생찾기 | 2. 전체학생보기 | 3. 뒤로가기");
						System.out.print(">>> ");
						int stsee = input.nextInt();
						switch(stsee) {
						case 1:
							System.out.println("찾으실 학생 이름을 입력해주세요");
							System.out.print(">>> ");
							String searchName = input.next();
							Student findstudent = find(searchName);
							if(findstudent == null) {
								System.out.println("찾으시는 학생이 없습니다.");
							}else {
								
							}
						case 2:
						for (int i = 0; i < st.length; i++) {
							if (st[i] != null) { // st배열 칸이 null이 아니면
								System.out.println("==============================");
								System.out.println("  이름   | 학번 | 성별 | 학년 | 반");
								System.out.println(" "+st[i].name+"     " + st[i].num +"    "+ 
								st[i].sex + "     "+st[i].grade + "    " + st[i].classroom);
							} // if 종료
						} // case2 for 종료
						break; // 학생보기 정지
					} //case2 switch 종료
						break;
						
					case 3:
						System.out.println("수정할 학생명을 입력하세요.");
						System.out.print(">>>");
						String searchName = input.next(); // 키보드로 받은 이름
						Student findstudent = find(searchName); // 아래 만든 메서드로 찾아옴
						if(findstudent == null) {
							System.out.println("찾은 학생이 없습니다.");
						}else {
							System.out.println("수정할 학생 번호를 입력하세요.");
							findstudent.num = input.nextInt();
							System.out.println("학생 정보 수정 완료.");
						}
						break;
						
					case 4:
						System.out.println("삭제할 학생명을 입력하세요.");
						System.out.print(">>>");
						String deleteName = input.next();
						Student deleteStudent = find(deleteName); // 아래만든 메서드가 객체를 찾아옴
						if(deleteStudent ==null) { // 삭제할 학생이 없다면
							System.out.println("삭제할 학생이 없습니다.");
						}else { // 삭제할 학생이 있다면
							for(int i = 0; i < st.length; i++) {
								if(st[i].name.equals(deleteStudent.name) ) {
							st[i] = null;
							System.out.println("입력하신 학생이 삭제되었습니다.");
							break;
								}
							}
						}// if 종료
						break;
					case 5:
						System.out.println("메인 메뉴로 이동합니다.");
						strun = false;
						break;
						
						default:
							System.out.println("1~5까지 입력해주세요");
						
						
					}// switch 종료
				} // strun 종료
				break;

			case 2:
				System.out.println("성적관리 클래스로 진입");
				break;

			case 3:
				System.out.println("통계 클래스로 진입");
				break;

			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;

			default:
				System.out.println("1~4번 값만 입력하세요.");
				// break; 을 작성하면 꺼짐.
			} // switch 종료 (주메뉴용)

		} // while 종료

	} // main 종료

	private static Student find(String name) { // 이름으로 객체를 찾아오는 메서드
		Student student = null; // 빈객체 생성
		for(int i = 0; i < st.length; i++) {
			if(st[i] != null) {
				String arrayName = st[i].name; // 배열에 있는 이름을 가져옴
				if(arrayName.equals(name)) { // 배열 name과 키보드 name 비교
					student = st[i]; // 찾은 객체를 빈 객체에 넣음
					break;
				}// if 안에 if 종료
			}// if 종료	
		}// for 종료
		return student; // student 로 리턴한다.
	} // find 종료
} // class 종료
