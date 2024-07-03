package ch10;

public class StringBuilderExam {

	public static void main(String[] args) {
		// StringBuilder 는 신형문자열 처리 방법으로 객체의 문자열을 수정, 추가 할 수 있다.
		// 동기화되지 않는다는 점을 제외하고는 StringBuffer 클래스와 메서드가 같다.(비동기화)
		// 동기화 : 여러 객체 변수를 같이 쓰는 개념
		// 구현에서 빠르기 때문에 우선적으로 활용한다.
		
		
		
		StringBuilder stringbuilder = new StringBuilder(); // 16개 문자열 배열
		StringBuilder stringbuilder1 = new StringBuilder("Hello "); // 5개 문자열 배열
		StringBuilder stringbuilder2 = new StringBuilder("Hello "); // 50개 문자열 배열
		
		stringbuilder1.append("Programing");
		System.out.println(stringbuilder1);
		
		stringbuilder1.insert(6, "JAVA ");
		System.out.println(stringbuilder1);
		
		stringbuilder1.replace(1, 4, "Good");
		System.out.println(stringbuilder1);
		
		stringbuilder1.delete(1, 5);
		System.out.println(stringbuilder1);
		
		stringbuilder1.reverse();
		System.out.println(stringbuilder1);
		
		System.out.println(stringbuilder1.equals(stringbuilder2)); // equals 재정의 안됨.
		
		
		
		

	}

}
