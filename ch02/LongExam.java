package ch02;

public class LongExam {

	public static void main(String[] args) {
		// long 타입은 int 타입에 2배인 64비트 값을 갖는다.
		// 대부분 금융, 은행, 증권 등 돈에 관련된 변수타입으로 사용된다.
		// 초기값 입력시 int와 차이를 주기 위해 숫자뒤에 l,L울 붙인다.
		
		long var1 = 10 ; // int 범위에서는 생략 가능
		long var2 = 20L ;
		//long var3 = 2200000000 ; // The literal 2200000000 of type int is out of range 
		long var4 = 2200000000L ; // int의 범위 초과시 L을 붙여야함.

	}

}
