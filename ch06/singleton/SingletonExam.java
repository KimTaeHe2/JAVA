package ch06.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// 싱글톤 사용하기.
		
		// 생성자에 private을 붙여서 사용불가.
		// Singleton obj1 = new Singleton();
		// Singleton obj2 = new Singleton();
		
		Singleton obj3 = Singleton.getInstance(); // 싱글톤 객체 연결
		Singleton obj4 = Singleton.getInstance();
		
		if(obj3 == obj4) {
			System.out.println("같은 싱글톤 객체 입니다.");
		}else {
			System.out.println("다른 싱글톤 객체 입니다.");
		} // if 종료
		
		
	} // main 종료

} // class 종료
