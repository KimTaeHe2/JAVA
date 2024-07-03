package ch12.threadname;

public class ThreadA extends Thread{
	
	public ThreadA() {
		setName("스레드A");
	} // 생성자

	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName()+ " 가 출력한 내용");
		} // for 종료
	} // run 종료
}
