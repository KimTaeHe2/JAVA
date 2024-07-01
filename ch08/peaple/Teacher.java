package ch08.peaple;

public class Teacher extends Peaple{
	
	// 필드
	public int employeeNo;	
	
	// 생성자
	public Teacher(String name, String ssn, int employeeNo) {
		super(name, ssn);
		this.employeeNo = employeeNo;
	}
	
	// 메서드

}
