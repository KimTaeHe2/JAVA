package ch12.threadname;

public class ThreadB extends Thread{
	
	public ThreadB() {
		setName("스레드B");
	} // 생성자

	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName()+ " 가 출력한 내용");
		} // for 종료
	} // run 종료
}
