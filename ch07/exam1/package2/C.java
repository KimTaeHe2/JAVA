package ch07.exam1.package2;

import ch07.exam1.package1.A;
import ch07.exam1.package1.B;

public class C {
	A a ; // default 는 다른 패키지는 접근 안됨
	B b ; // public 은 import 처리 하면 접근 가능
	
	A a1 = new A(true); // public 생성자
	//A a2 = new A (3);	// default 생성자
	//A a3 = new A("문자열"); // private 생성자
}
