package ch06.circle;

public class Circle2Exam {

	public static void main(String[] args) {
		// 생성자 오버로딩으로 구현

		Circle circle = new Circle(30);
		circle.name = "김태희";
		
		// 동작
		double result = circle.getArea(); // 메서드 호출 (동작->리턴)

		// 출력
		System.out.println("원의 넓이 : " + circle.radius);
		System.out.println("작성자 : " + circle.name);
		System.out.println("동작결과 : " + result);

	} // main 종료

} // class 종료
