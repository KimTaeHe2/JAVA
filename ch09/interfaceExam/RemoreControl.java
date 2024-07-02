package ch09.interfaceExam;

public interface RemoreControl {
	// 상수(변하지 않는 값) -> 초기값이 있다.
	// 타입 상수명 = 값; static final 생략해도 상수처리 가능
	// interfac 는 가능하면 public 처리 (상대가 원하는 내용을 교환해야하기때문)
	public /* static final */ int MAX_VOLUME = 10; // 최대볼륨
	public int MIN_VOLUME = 0;					  // 최소볼륨
	
	// 상수 필드 : 인터페이스는 객체 사용설명서
	// 런타임시(프로그램실행) 데이터를 저장할 수 있는 필드를 선언할 수 없다.
	
	
	// 메서드(추상, 디폴트, 정적)
	// 추상메서드 : abstract -> 자식에게 강제로 주입해주는{} 중괄호 실행문 X ;으로 끝낸다.
	// abstract 생략 가능
	public /* abstract */ void turnON();	// 전원을 켠다
	public void turnOff();					// 전원을 끈다
	public void setVolume(int volume);		// 소리 조절
	
	// 디폴트 : 인스턴스 메서드용 new 로 객체 생성 가능
	
	/* public */ default void setMute(boolean mute) { // mute = true & false 가 들어온다
		if(mute) {
			System.out.println("무음 처리 합니다.");
		} else{
			System.out.println("무음 처리 해제");
		} // if종료
	}
	
	// 정적 : new 없이 사용되는 메서드
	
	/* public */ static void changeBattery() {
		System.out.println("건전지를 교환해야 합니다.");
	}
	
	
	
}
