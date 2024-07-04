package ch13.nongeneric;

public class BoxExam {

	public static void main(String[] args) {
		// Object Type은 최상위 클래스로 모든 타입으로 자동타입, 강제타입 변환이 된다
		// 자동 타입 변환 후에 사용하려면 강제타입으로 변환하여 활용한다.
		// 예외 : System.oun.println(int, String, double)은 자동으로 강제타입 변환 코드가 들어 있음
		
		// 강제타입변환 테스트
		Box box = new Box(); // 기본생성자로 객체 생성
		box.setObject("문자열"); // 자동 타입 변환으로 String 처리 됨.
		System.out.println(box.getObject());
		String name = (String) box.getObject(); // 강제 타입 변환
		
		Box boxI = new Box();
		boxI.setObject(1234); // Object 타입에 정수 대입
		Integer val = (Integer) boxI.getObject(); // 강제 타입 변환
		
		Box boxA = new Box();
		boxA.setObject(new AppleDTO()); // 자동 타입 변환
		// Box boxA = new AppleDTO();
		AppleDTO appleDTO = (AppleDTO) box.getObject(); // 강제 타입 변환

	} // main 종료

} // class 종료
