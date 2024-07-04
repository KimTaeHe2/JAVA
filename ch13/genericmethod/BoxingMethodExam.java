package ch13.genericmethod;

public class BoxingMethodExam {

	public static void main(String[] args) {
		// 제네릭 메서드를 사용하여 강한 타입체크
		
		Box<Integer> boxI = Util.<Integer>boxing(100);
		int intValue = boxI.get();
		System.out.println(intValue);
		
		
		Box<String> boxS = Util.<String>boxing("홍길동");
		String strValue = boxS.get();
		System.out.println(strValue);

	}

}
