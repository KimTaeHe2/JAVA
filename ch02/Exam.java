package ch02;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// 연습용 폴더
		
		int fish1 = 0 ;
		int fish2 = 0 ;
		int fish3 = 0 ;
		int fish4 = 0 ;
		int fish5 = 0 ;
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("오늘의 시세를 입력하세요");
		System.out.print("광어 : ");
		fish1 = input.nextInt();
		
		System.out.print("연어 : ");
		fish2 = input.nextInt();
		
		System.out.print("우럭 : ");
		fish3 = input.nextInt();
		
		System.out.print("도다리 : ");
		fish4 = input.nextInt();
		
		System.out.print("숭어 : ");
		fish5 = input.nextInt();
		
		System.out.println();
		System.out.println();
		System.out.println("-- 오늘의 시세 --");
		System.out.println("광어 : " + fish1);
		System.out.println("연어 : " + fish2);
		System.out.println("우럭 : " + fish3);
		System.out.println("도다리 : " + fish4);
		System.out.println("숭어 : " + fish5);
		System.out.println("---------------");
		

	}

}
