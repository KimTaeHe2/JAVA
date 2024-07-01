package ch06.circle;

public class Circle { 
	// 메인이 없는 클래스는 라이브러리 클래스라고 함 (인스턴스용)
	// 인스턴스는 객체를 생성하는 용도
	
	// 필드(맴버 변수로 객체가 가지고 있을 값)
	public int radius;
	public String name;
	
	
	// 생성자(Circle circle = new Circle(); -> 기본생성자로 생략가능
	public Circle() { // 객체 생성시 매개값 없이 생성이된다.
		
	} // 기본생성자 ( 클래스와 이름이 같은 메서드 )
	
	public Circle(int radius) { // 생성자 오버로딩
		this.radius = radius;
	} // 사용자지정 생성자 -> Circle circle = new Circle(10);
	
	public Circle(int radius, String name) { // 생성자 오버로딩
		this.radius = radius;
		this.name = name;
		
	} // 사용자지정 생성자 -> Circle circle = new Circle(10, "지구");
	
	// 메서드 ( 동작에 해당하는 코드 )
	
	public double getArea() {
		return 3.14* radius * radius ;
		// getArea() 메서드 호출시 원의 값을 계산하여 출력
	}
	
	
} // class 종료
