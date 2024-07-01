package ch08.extended.tire;

public class KumhoTire extends Tire {// 자식 타이어

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO oem 타이어에서 만든 규격대로 생성자 만듬.
	}

	@Override
	public boolean roll() { // 달리면서 마일리지 소모

		accRotation += 8;
		if (accRotation < maxRotation) { // 타이어 소모 측정
			System.out.println(location + " 위치에 금호타이어 수명 : " + (maxRotation - accRotation) + "마일리지");
			return true;
		} else {
			System.out.println("****** 경고 ******");
			System.out.println(location + "금호타이어가 펑크 되었습니다.");
			return false;
		}
	}
}
