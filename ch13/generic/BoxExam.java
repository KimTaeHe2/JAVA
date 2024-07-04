package ch13.generic;

public class BoxExam {
	
	// 제네릭은 <String> 문자열만 처리함.
	// <Integer> 정수만 처리, <Apple> 객체만 처림
	
	public static void main(String[] args) {
		
		Box<String> boxS = new Box<String>();
		boxS.setT("문자열");
		String name = boxS.getT();
		System.out.println(name);
		
		Box<Integer> boxI = new Box<Integer>();
		boxI.setT(1234);
		Integer age = boxI.getT();
		System.out.println(age);
		
	}
	
}
