package ch09.interfaceExam;

import java.util.Scanner;

public class RemoteExam {

	public static void main(String[] args) {
		// 인터페이스를 사용한 구현클래스를 이용해본다.
		RemoreControl.changeBattery();
		Scanner scanner = new Scanner(System.in);
		System.out.println("리모컨 인터페이스를 사용합니다.");
		
		RemoreControl rc  = null; // 인터페이스를 rc 변수에 연결
		
		boolean run = true;
		while (run) {
			System.out.println("=======================================");
			System.out.println(" 1. TV | 2. 오디오 | 3. 스마트TV | 4. 종료");
			System.out.println("=======================================");
			System.out.print(">>> ");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				rc = new Television(); // RemoreControl rc = new Television();
				 rc.turnON();
				 rc.turnOff();
				 rc.setMute(false); // 음소거 on
				 rc.setMute(true);  // 음소거 off
				break;

			case 2:
				rc = new Audio(); // RemoreControl rc = new Audio();
				 rc.turnON(); 
				 rc.turnOff();
				break;
				
			case 3:
				rc = new SmartTelevision();
				rc.turnON();
				Searchable se = new SmartTelevision(); // 2번째 인터페이스 연동
				System.out.println("인터넷 검색을 시작합니다.");
				System.out.print(">>> ");
				String sc = scanner.next();
				se.search(sc);
				rc.turnOff();
				break;
				
			case 4:
				System.out.println("시스템 종료");
				run = false;
				break;

			default:
				System.out.println("1~2 값만 넣어주세요");

			} // switch 종료	
		} // while 종료
	} // main 종료

} // class 종료
