package ch04;

public class For2To9Exam {

	public static void main(String[] args) {
		// 구구단 만들기

		for(int num = 2 ; num <= 9 ; num ++) {
			System.out.println("===========" + num + " 단=========");
			for(int numb = 1 ; numb <= 9 ; numb++) {
				System.out.println(num + " X " + numb + " = "+(num*numb));
			} // 작은 for 종료
		} // 큰 for 종료

	} // main 종료

} // class 종료
