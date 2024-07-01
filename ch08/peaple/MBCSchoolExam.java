package ch08.peaple;

public class MBCSchoolExam {

	public static void main(String[] args) {
		// 상속관계의 객체를 가져와 출력
		// 생성자를 활용해본다. -> 객체 생성시 초기값을 줌.
		
		// 부모 객체를 사용해보자.
		
		Peaple peaple = new Peaple("부모", "엄마 주민번호");
		System.out.println(peaple.name + peaple.ssn);
		
		
		Student student = new Student("자식", "자식주민번호", 15);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Teacher teacher = new Teacher("선생님", "선생님주민번호", 39);
		System.out.println(teacher.name);
		System.out.println(teacher.ssn);
		System.out.println(teacher.employeeNo);
		
		
		// 다형성
		
		Peaple multi1 = new Student("홍길동", "홍길동주번", 2);
		Peaple multi2 = new Teacher("고길동", "고길동주번", 22);

	} // main 종료

} // class 종료
