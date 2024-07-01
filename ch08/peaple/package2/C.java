package ch08.peaple.package2;

import ch08.peaple.package1.A;

public class C extends A{
	
	// 필드
	
	
	// 생성자 -> 다른클래스에서는 생성자로 부모객체를 연결
	public C() {
		super();
		this.field = "자바";
		this.method();
	}
	
	// 메서드
	
	public void method() {
		
		// A a = new A();
		// a.filed = "자바";
		// a.method();
	}
}
