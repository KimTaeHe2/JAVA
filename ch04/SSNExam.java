package ch04;

import java.util.Scanner;

public class SSNExam {

	public static void main(String[] args) {
		// 주민번호 7번째 글자를 입력 받아 남여 파악용
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("주민번호 7번째 숫자 입력 : ");
		int ssn = input.nextInt() ;
		
		if( (ssn%2 == 1) && (ssn < 9) ) {
			System.out.println("남자입니다.");
		}
		if ( (ssn%2 == 0) && (ssn < 9)) {
			System.out.println("여자입니다");
		}
		if( (ssn < 0) || (ssn > 9) ) {
			System.out.println("입력오류입니다. 입력오류 이유 -> 1이상 9미만으로 입력해주세요.");
		}
	
	}  
}
