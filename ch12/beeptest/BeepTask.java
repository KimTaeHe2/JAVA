package ch12.beeptest;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	// 소리가 나는 스레드
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i++) {
			toolkit.beep(); // 사운드로 경고음이 출력됨
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // 소리나는 for 종료
	}

}
