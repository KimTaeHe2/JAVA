package ch09.interfaceExam;

public class Television implements RemoreControl{
	// 리모컨 인터페이스를 사용하는 구현체
	
	// 필드
	private int volume; // 숫자로 표시되는 볼륨 값
	
	
	// 기본 생성자 : Television tel = new Television();
	
	
	
	// 메서드
	
	
	@Override // 재정의 (위에서 만든 메서드를 동작시킴)
	public void turnON() {
		// 전원을 켠다.
		System.out.println("tv의 전원을 켭니다");
	}

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("TV를 무음 처리 합니다.");
		} else{
			System.out.println("TV를 무음 처리 해제합니다.");
		} // if종료
	}

	@Override
	public void turnOff() {
		// 전원을 끈다.
		System.out.println("tv의 전원을 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨 조절용
		if(volume > RemoreControl.MAX_VOLUME) {
			this.volume = RemoreControl.MAX_VOLUME;
		}else if(volume < RemoreControl.MIN_VOLUME) {
			this.volume = RemoreControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		} // if 종료
		System.out.println("현재 볼륨 : " + volume);
	} 
	
}
