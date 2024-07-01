package ch08.extended.abstractexam;

public class PhoneExam {

	public static void main(String[] args) {
		
		// Phone phone = new Phone("김태희");
		// Phone 클래스에 abstract가 되어 있어 객체로 사용할 수 없다.
		// 사용하려면 실체 클래스(조원) 상속받아 활용해야 한다.(강제)
		
		SmartPhone smartPhone = new SmartPhone("김태희");
		
		smartPhone.turnOn();					//부모
		System.out.println(smartPhone.owner);	// 부모생성자
		smartPhone.internetSerch();				// 자식
		smartPhone.turnOff();					// 부모
		

	} // main 종료

} // class 종료
