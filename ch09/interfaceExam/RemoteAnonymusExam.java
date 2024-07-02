package ch09.interfaceExam;

public class RemoteAnonymusExam {
	
	public static void main(String[] args) {
		// 인터페이스를 구현클래스로 사용하지 않고 인터페이스만으로 실행한다

		RemoreControl remoreControl = new RemoreControl() {
			int volume;
			@Override
			public void turnOff() {
				System.out.println("익명으로 전원을 끕니다");
			}
			
			@Override
			public void turnON() {
				System.out.println("익명으로 전원을 켭니다");
				
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume > RemoreControl.MAX_VOLUME) {
					this.volume = RemoreControl.MAX_VOLUME;
				}else if(volume < RemoreControl.MIN_VOLUME) {
					this.volume = RemoreControl.MIN_VOLUME;
				}else {
					this.volume = volume;
				} // if 종료
				System.out.println("현재 익명객체 볼륨 : " + volume);
			}
		}; // 인터페이스를 객체로 생성하여 익명으로 실행

	} // main 종료

} // class 종료
