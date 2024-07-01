package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 정수 6개의 값을 입력받고 랜덤으로 6개의 값을 생성
		// 몇개가 맞았는지 파악
		
		Scanner in = new Scanner(System.in) ;
		System.out.println("=====이번주 로또번호 맞추기=====");
		System.out.print("첫번째 번호를 입력해주세요 : ");
		int myNum1 = in.nextByte() ;
		
		System.out.print("두번째 번호를 입력해주세요 : ");
		int myNum2 = in.nextByte() ;
		
		System.out.print("세번째 번호를 입력해주세요 : ");
		int myNum3 = in.nextByte() ;
		
		System.out.print("네번째 번호를 입력해주세요 : ");
		int myNum4 = in.nextByte() ;
		
		System.out.print("다섯번째 번호를 입력해주세요 : ");
		int myNum5 = in.nextByte() ;
		
		System.out.print("여섯번째 번호를 입력해주세요 : ");
		int myNum6 = in.nextByte() ;
		
		int num1 = (int) (Math.random() * 45) + 1 ;	
		int num2 = (int) (Math.random() * 45) + 1 ;	
		int num3 = (int) (Math.random() * 45) + 1 ;	
		int num4 = (int) (Math.random() * 45) + 1 ;
		int num5 = (int) (Math.random() * 45) + 1 ;
		int num6 = (int) (Math.random() * 45) + 1 ;
		
		int x = 0 ;
		
		if (myNum1 == num1 || myNum1 == num2 || myNum1 == num3 || myNum1 == num4 || myNum1 == num5 || myNum1 == num6) {
			++x ; }
		if (myNum2 == num1 || myNum2 == num2 || myNum2 == num3 || myNum2 == num4 || myNum2 == num5 || myNum2 == num6) {
			++x ; }
		if (myNum3 == num1 || myNum3 == num2 || myNum3 == num3 || myNum3 == num4 || myNum3 == num5 || myNum3 == num6) {
			++x ; }
		if (myNum4 == num1 || myNum4 == num2 || myNum4 == num3 || myNum4 == num4 || myNum4 == num5 || myNum4 == num6) {
			++x ; }
		if (myNum5 == num1 || myNum5 == num2 || myNum5 == num3 || myNum5 == num4 || myNum5 == num5 || myNum5 == num6) {
			++x ; }
		if (myNum6 == num1 || myNum6 == num2 || myNum6 == num3 || myNum6 == num4 || myNum6 == num5 || myNum6 == num6) {
			++x ; } // 번호 맞춰보기 비교 if 문 종료
		
		System.out.println("==========================");
		System.out.println("이번주의 로또 당첨 번호입니다!");
	    System.out.println(num1+"-"+num2+"-"+num3+"-"+num4+"-"+num5+"-"+num6);
	    System.out.println("==========================");
		
		if(x==0) {
			System.out.println("번호가 하나도 맞지 않았습니다.."); }
		if(x==1) {
			System.out.println("번호가 1개 맞았습니다!"); }
		if(x==2) {
			System.out.println("번호가 2개 맞았습니다!"); }
		if(x==3) {
			System.out.println("번호가 3개 맞았습니다!"); }
		if(x==4) {
			System.out.println("번호가 4개 맞았습니다!"); }
		if(x==5) {
			System.out.println("번호가 5개 맞았습니다!"); }
		if(x==6) {
			System.out.println("번호가 전부 다 맞았습니다!"); }
		if(x >= 7 || x < 0) {
			System.out.println("프로그램 오류.");
		}


	}

}
