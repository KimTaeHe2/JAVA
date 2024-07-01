package ch07.mbcCar;

import ch07.nexen.*; // 넥센에서 만든 클래스는 모두 가져온다.

// import ch07.hankook.Tire;

public class Car {

	// 필드
	ch07.hankook.Tire hTire = new ch07.hankook.Tire(); 		// 한국타이어 패키지에서 가져옴 위에 임포트 참조.
	ch07.hankook.SnowTire sTire = new ch07.hankook.SnowTire();
	ch07.kumho.Tire kTire = new ch07.kumho.Tire(); 			// 금호타이어 패키지에서 가져옴. 요즘 트렌드
	ch07.kumho.EcoTire eTire = new ch07.kumho.EcoTire();
	ch07.hyundai.Engine hEngine = new ch07.hyundai.Engine();
	//ch07.nexen.BigWiethTire bTire = new ch07.nexen.BigWiethTire();
	//ch07.nexen.SportTire spTire = new ch07.nexen.SportTire();
	SportTire spTire = new SportTire();
	
	// 생성자
	
	
	// 메서드
	
	
} // class 종료
