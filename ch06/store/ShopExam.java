package ch06.store;

import java.util.Scanner;


public class ShopExam {
	public static Scanner input = new Scanner(System.in);
	public static Commodity[] goods = new Commodity[1000];
	public static Member[] members = new Member[100];
	public static Admin[] admins = new Admin[5];
	String admin;
	
	
	public static void main(String[] args) {
		
		Member members1 = new Member();
		members1.id = "김태희";
		members1.pw = "111";
		members1.email = "xogml0423@nate.com";
		members1.nickName = "태희";
		members[0] = members1;
		
		Member members2 = new Member();
		members2.id = "김태히";
		members2.pw = "222";
		members2.email = "xogml0423@nate.com";
		members2.nickName = "태히";
		members[1] = members2;
		
		Member members3 = new Member();
		members3.id = "김태이";
		members3.pw = "333";
		members3.email = "xogml0423@nate.com";
		members3.nickName = "태이";
		members[2] = members3;
		
		// 회원제 쇼핑몰 만들어보기
		boolean run = true;
		while (run) {
			System.out.println("             환영합니다. OOO쇼핑몰 입니다.");
			System.out.println("===============================================");
			System.out.println("1. 회원접속 | 2. 비회원 접속 | 3. 관리자 접속| 4. 종료");
			System.out.println("===============================================");
			System.out.print(">>> ");
			int select = input.nextInt();

			switch (select) {
			case 1:
				Member member = new Member();
				member.menu(input, members);
				break;
			case 2:
				
				break;
			case 3:
				Admin admin = new Admin();
				admin.menu(input, goods, members, admins);
				break;
			case 4:
				System.out.println("시스템 종료합니다.");
				run = false;
				break;
				
				default:
					System.out.println("잘못된 입력입니다. 1~4값만 입력해주세요");
			} // switch 종료
		} // while 종료
	} // main 종료

} // class 종료
