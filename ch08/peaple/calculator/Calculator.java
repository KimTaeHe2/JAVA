package ch08.peaple.calculator;

public class Calculator { // 계산기 부모클래스 (구형)
	
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 메서드 결과");
		
		return 3.14159 * r * r;
	}
}
