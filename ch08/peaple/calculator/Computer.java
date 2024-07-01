package ch08.peaple.calculator;

public class Computer extends Calculator{

	@Override // 재정의 하겠다.(다시 만들겠다)
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객채의 areaCircle() 재정의 결과");
		return super.areaCircle(r);
		// return Math.PI * r * r;
	} // 자식 클래스 (최신형 컴퓨터)
	
	
}
