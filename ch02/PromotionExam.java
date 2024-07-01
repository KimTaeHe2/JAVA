package ch02;

import java.util.Scanner;  // 다른 패키지에 있는 코드를 가져올때 import 가 잡힌다

public class PromotionExam {

	public static void main(String[] args) {
		// 자동타입 변환(Promotion)은 작은 크기의 타입을 큰 크기 타입으로 자동 변환
		// byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
		// 예를 들어 국, 영, 수, 사, 과 과목은 byte -> 총점 int -> 평균 double
		
		byte kor = 0 ;
		byte eng = 0 ;
		byte math = 0 ;
		byte sol = 0;
		byte sci = 0 ;
		
		//키보드로 점수를 입력 받는 곳
		Scanner input = new Scanner(System.in) ; // 키보드로 입력 받는 객체 생성 암기할 것
		System.out.print("국어 점수 : ");
		kor = input.nextByte();
		                                     // 스캐너 객체에서 키보드로 입력받은 값을 byte로 처리
		System.out.print("영어 점수 : ");      // ex) nextOOOO  빈 공간에 int, double 등으로 변환
		eng = input.nextByte();
		
		System.out.print("수학 점수 : ");
		math = input.nextByte();
		
		System.out.print("사회 점수 : ");
		sol = input.nextByte();
		
		System.out.print("과학 점수 : ");
		sci = input.nextByte();
		
		
		System.out.println("-------현재 점수표-------");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("사회 : " + sol);
		System.out.println("과학 : " + sci);
		System.out.println("---------------------");
		
		// 연산시 기본 타입은 int (자동 타입 변환)
		int total = 0 ;
		total = kor + eng + math + sol + sci ;
		System.out.println("총점 : " + total);
		
		double avg = 0.0 ;
		avg = total / 5 ;
		System.out.println("평균 : " + avg);
		
		if(avg >= 60) {
			System.out.println("---합격을 축하드립니다.---");
			System.out.println("현재 점수 : " + avg);
			System.out.println("합격 점수 : 60점 이상");
		}else {
			System.out.println("---불합격을 축하드립니다.---");
			System.out.println("현재 점수 : " + avg);
			System.out.println("합격 점수 : 60점 이상");
		}
	}

}
