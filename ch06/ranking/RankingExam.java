package ch06.ranking;

import java.util.Scanner;

public class RankingExam {

	public static void main(String[] args) {
		// 열거 타입을 사용하려면 객체를 생성하여 활용함(new 사용 안됨)
		
		// 호출 불가 Ranking rk = new Ranking();
		Ranking rk = Ranking.GUEST;
		String rkString = rk.name(); // enum 타입의 상수값을 문자열로 변환
		
		System.out.println("enum 값 : "+rk);
		
		Ranking rk1 = Ranking.GUEST;
		Ranking rk2 = Ranking.GUEST;
		
		System.out.println(rk1 == rk2);
		
		Scanner input = new Scanner(System.in);
		System.out.print("키보드 입력 : ");
		String rank = input.next();
		
		System.out.println("값 비교 :" + (rkString == rank));
		System.out.println("equals 비교 : "+ (rkString.equals(rank)));
		
		int enumIndex = rk.ordinal();
		System.out.println("열거 순서 파악 : " + enumIndex );
		
		
				
		
		
		
	} // main 종료

} // class 종료
