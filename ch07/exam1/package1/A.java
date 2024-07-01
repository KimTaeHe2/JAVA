package ch07.exam1.package1;

public class A {


	// 접근 제한자를 생략하면 default 처리됨
	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	// 생성자
	public A(boolean b) {
		// public 공용 접근 -> 어디서나 사용 가능
	}
	A(int b){ // default 같은 패키지에서만 접근 가능
		
	}
	
	private A(String s) { // private 개인적인 접근 자신 클래스 안에서만 접근 가능
		
	}
	// 메서드
}
