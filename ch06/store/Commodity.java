package ch06.store;

import java.util.Scanner;

public class Commodity {
	
	String productNum;
	String productName;
	String explanation;
	String productprice;
	
	
	public void menu(Scanner input, Commodity[] goods) {
		boolean run = true;
		while(run) {
		System.out.println("                STORE");
		System.out.println("===============================================");
		System.out.println("1. 상품보기 | 2. 장바구니 | 3. 주문내역 | 4. 뒤로가기");
		System.out.println("===============================================");
		System.out.print(">>> ");
		int select = input.nextInt();
		
		switch(select) {
		case 1:
			
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			run = false;
			break;
			
			default:
				System.out.println("잘못된 입력입니다. 1~4까지 입력해주세요.");
		} // switch 종료
		
		
		
		} // while 종료
	}// menu 종료
} // class 종료
