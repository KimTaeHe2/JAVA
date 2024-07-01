package ch01;

public class Variable {

	public static void main(String[] args) {
		// 변수의 사용 범위를 알아보자.
		// 변수는 괄호 안에서만 효력이 발생한다. -> 내부 괄호까지
		  int v1 = 15;
		  int v2 = 0 ;
		  if(v1>10) { //if는 (조건)을 참/거짓을 판단함
			  v2 = v1 + 10 ;
		  		  }
		  int v3 = v1 + v2 + 5 ;
		  System.out.println(v1);
		  System.out.println(v2);
		  System.out.println(v3);
	}

}
