package ch04;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기
		// C -> 시동을 건다
		// R -> 계기판 정보 출력
		// U -> 주행
		// D -> 시동을 끈다
		Scanner input = new Scanner(System.in) ;
		boolean run = true ; // 시동을 켠다.
		int speed = 0 ; // 차량 속도
		final int MAXSPEED = 300 ; // 최고속도 상수(변경안됨) 상수는 대문자로 표기
		final int MINSPEED = 0 ;   // 최저속도 상수(변경안됨)
		
		
		System.out.println("람보르기니가 입고 되었습니다.");
		System.out.println("시동을 켭니다.");
		System.out.println("현재 속도 : " + speed + "km/h");
		while(run) {
			// 무한 반복 중 메뉴가 출력
			
			System.out.println("=======================================================");
			System.out.println("           |         |           |          |          ");
			System.out.println("  0.시동off |  1.엑셀  |  2.브레이크 | 3.음악재생 | 4. 주유   ");
			System.out.println("           |         |           |          |          ");
			System.out.println("=======================================================");
			System.out.print("( 0~4 숫자입력)>>>>>");
			int select = input.nextInt();
			switch(select) {
			case 0 :
				System.out.println("시동을 종료합니다");
				run = false ; // while 종료
				break;
				
			case 1 :
				System.out.println("가속을 진행합니다.");
				speed += 30 ;
				if(speed >= MAXSPEED) { // 현재속도가 최고속도보다 크거나 같으면!
					speed = MAXSPEED ;  // 300이상 출력 안됨
				}
				System.out.println("현재 속도 : " + speed + "km/h");
				break;
				
			case 2 :
				System.out.println("감속을 진행합니다.");
				speed -= 30 ;
				if(speed <=MINSPEED) { // 현재속도가 최저속도보다 작거나 같으면!
					speed = MINSPEED ; // 0이하 출력 안됨
				}
				System.out.println("현재 속도 : " + speed + "km/h");
				break;
				
			case 3 :
				System.out.println("노래가 나옵니다");
				
				System.out.println("현재 속도 : " + speed + "km/h");
				break;
			case 4 :
				System.out.println("주유를 합니다.");
				
				System.out.println("현재 속도 : " + speed + "km/h");
				break;
				
				
			} // switch 종료
			
		} // while 종료
		System.out.println("람보르기니 자동차가 사라집니다.");
	} // main 종료

} // class 종료
