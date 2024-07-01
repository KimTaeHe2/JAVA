package ch03;

import java.util.Scanner;

public class CounditionalExam {

	public static void main(String[] args) {
		// 3항 연산자는 if를 간단히 처리하기 위해 활용된다.
		// (조건식) ? 참 : 거짓
        
		byte score = 0 ;
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("김태희 점수 : ");
		score = input.nextByte();
		
		char grade = (score == 100) ? 'S' : ((score >= 90) ? 'A' : 
			((score >= 80) ? 'B' : ((score >= 70) ? 'C' : ((score >= 60)? 'D' : 'E')))) ;                   
		
		System.out.println(score + " 점수는 \n" + grade + " 등급 입니다. ");
	}

}
