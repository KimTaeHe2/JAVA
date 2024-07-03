package ch10;

public class StringBufferExam { // 구형

	public static void main(String[] args) {
		// String 으로 만든 문자열은 객체로 추가나 변경이 안되고 새로운 객체로 또 만듬.
		// StringBuffer는 문자열을 수정과 변경 할 수 있다
		// StringBuilder는 StringBuffer와 다르게 멀티 스레드 환경에서 안정적이지 않음
		// StringBuilder는 싱글 스레드 환경에서 StringBuffer보다 더 빠른 성능을 가짐.
		
		StringBuffer stringBuffer = new StringBuffer(); // 16개 문자열 배열
		StringBuffer stringBuffer1 = new StringBuffer("Hello "); // 5개 문자열 배열
		StringBuffer stringBuffer2 = new StringBuffer("Hello "); // 50개 문자열 배열
		
		stringBuffer1.append("Programing");
		System.out.println(stringBuffer1);
		
		stringBuffer1.insert(6, "JAVA ");
		System.out.println(stringBuffer1);
		
		stringBuffer1.replace(1, 4, "Good");
		System.out.println(stringBuffer1);
		
		stringBuffer1.delete(1, 5);
		System.out.println(stringBuffer1);
		
		stringBuffer1.reverse();
		System.out.println(stringBuffer1);
		
		System.out.println(stringBuffer1.equals(stringBuffer2)); // equals 재정의 안됨.
		
		
		
		
		
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
