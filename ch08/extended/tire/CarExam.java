package ch08.extended.tire;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주행 테스트
		// 결론 Tire tire = new Tire();
		// 	   Tire tire = new hankookTire();
		//     Tire tire = new KumhoTire(); -> 다형성
		Car car = new Car(); // 서비스
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <=30; i++) { // 30번 주행
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("===============================");
				System.out.println("앞 왼쪽 고장");
				System.out.println("1. 한국타이어 2. 금호타이어 3. oem타이어");
				System.out.print(">>> ");
				int select1 = scanner.nextInt();
				if(select1 == 1) {
					car.fl = new HankookTire(90, "앞왼");
					System.out.println("한국타이어 교체 성공");
				}else if(select1 == 2) {
					car.fl = new KumhoTire(90, "앞왼");
					System.out.println("금호타이어 교체 성공");
				}else if(select1 == 3) {
					car.fl = new Tire(90, "앞왼");
					System.out.println("oem타이어 교체 성공");
				} // if 종료
				System.out.println("교체실패 = 잘못된 입력입니다.");
				System.out.println("==============================");
				break;
				
			case 2:
				System.out.println("===============================");
				System.out.println("앞 오른쪽 고장");
				System.out.println("1. 한국타이어 2. 금호타이어 3. oem타이어");
				System.out.print(">>> ");
				int select2 = scanner.nextInt();
				if(select2 == 1) {
					car.fr = new HankookTire(90, "앞오");
					System.out.println("한국타이어 교체 성공");
				}else if(select2 == 2) {
					car.fr = new KumhoTire(90, "앞오");
					System.out.println("금호타이어 교체 성공");
				}else if(select2 == 3) {
					car.fr = new Tire(90, "앞오");
					System.out.println("oem타이어 교체 성공");
				} // if 종료
				System.out.println("교체실패 = 잘못된 입력입니다.");
				System.out.println("==============================");
				break;
				
			case 3:
				System.out.println("===============================");
				System.out.println("뒤 왼쪽 고장");
				System.out.println("1. 한국타이어 2. 금호타이어 3. oem타이어");
				System.out.print(">>> ");
				int select3 = scanner.nextInt();
				if(select3 == 1) {
					car.bl = new HankookTire(90, "뒤왼");
					System.out.println("한국타이어 교체 성공");
				}else if(select3 == 2) {
					car.bl = new KumhoTire(90, "뒤왼");
					System.out.println("금호타이어 교체 성공");
				}else if(select3 == 3) {
					car.bl = new Tire(90, "뒤왼");
					System.out.println("oem타이어 교체 성공");
				} // if 종료
				System.out.println("교체실패 = 잘못된 입력입니다.");
				System.out.println("==============================");
				break;
				
			case 4:
				System.out.println("===============================");
				System.out.println("뒤 오른쪽 고장");
				System.out.println("1. 한국타이어 2. 금호타이어 3. oem타이어");
				System.out.print(">>> ");
				int select4 = scanner.nextInt();
				if(select4 == 1) {
					car.br = new HankookTire(90, "뒤오");
					System.out.println("한국타이어 교체 성공");
				}else if(select4 == 2) {
					car.br = new KumhoTire(90, "뒤오");
					System.out.println("금호타이어 교체 성공");
				}else if(select4 == 3) {
					car.br = new Tire(90, "뒤오");
					System.out.println("oem타이어 교체 성공");
				} // if 종료
				System.out.println("==============================");
				break;
			
			} // switch 종료
			System.out.println("=======정상주행=======");
		} // for 종료

	} // main 종료

} // class 종료
