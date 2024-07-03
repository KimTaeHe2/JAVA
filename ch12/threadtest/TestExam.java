package ch12.threadtest;

public class TestExam {

	public static void main(String[] args) {
		// 메인스레드
		Runnable tk = new Tesk(); // 다형성
		// Runnable 타입의 tk 변수를 Tesk 객체를 연결
		// 스레드에서 실행할 객체를 받음
		
		Thread th = new Thread(tk);
		// 스레드 타입에 th 변수에 스레드 객체를 tk를 활용하여 생성 (스레드가 새로 만들어짐.)
		// 스레드가 새로 만들어 짐
		
		th.start(); // 스레드 시작
		// 만든 스레드를 시작
		
		System.out.println("============== 익명의 구현체 ==============");
		Thread anonymousTH = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명의 구현체로 스레드 생성됨.");
				
			}
		});
		
		anonymousTH.start();
				
		
		
		
		
		
		
	}

}
