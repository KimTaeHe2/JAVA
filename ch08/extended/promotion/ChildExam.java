package ch08.extended.promotion;

public class ChildExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child ch = new Child(); // 자식 객체생성
		
		ch.memthod1(); 	// 부모 메서드
		ch.method2(); 	// 자식 메서드
		ch.method3(); 	// 자식 메서드
		
		
		Prarent pr = ch;
		// Prarent pr = new Child();
		System.out.println("== 자동타입변환 ==");
		pr.memthod1(); 	// 부모메서드
		pr.method2(); 	// 자식메서드
		// pr.method3();  부모타입으로 정하면 자식 메서드 사용 안됨
		// 사용하려면 재정의를 해야 함.
		
	} // main 종료

} // class 종료
