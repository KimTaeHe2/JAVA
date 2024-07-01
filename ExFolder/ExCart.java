package ExFolder;

import java.util.Scanner;

public class ExCart {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);

		boolean run = true;
		boolean my = true;

		int speed = 0;
		final int MAXSPEED = 200;
		final int MINSPEED = 0;

		int oile = 100;
		final int MAXOILE = 100;
        
		int ac = 0;
		final int MAXAC = 5 ;
		final int MINAC = 0 ;
		
		int music = 0 ;
		final int MAXMUS = 10 ;
		final int MINMUS = 0 ;
		String str ;

		while (my) {
			System.out.println("반갑습니다. 주행 전 본인인증 도와드리겠습니다");
			System.out.println("비밀번호를 입력해주세요.");
			int num = input.nextInt();
			int ssn = 7777;

			if (num == ssn) {
				System.out.println("환영합니다 김태희님 안전운행 하시기 바랍니다.");
				my = false;
			} else {
				System.out.println("틀렸습니다. 다시 입력해주시기 바랍니다.");
				System.out.println("================================");
			} // 본인확인 if 종료

		} // 본인확인 while 종료

		while (run) {
			System.out.println("==============================================================");
			System.out.println("     메뉴                  현재속도              9. 멀티미디어      ");
			System.out.println("  0.  시동 OFF             " + speed + "km/h                   음악    ");
			System.out.println("  1.  가속                                     Volume : "+music);
			System.out.println("  2.  감속                                        에어컨        ");
			System.out.println("  3.  주행모드변경            Oile 8.주유         바람세기 : "+ac );
			System.out.println(" 4,5. 볼륨조절                  " + oile + " %                주행모드       ");
			System.out.println(" 6,7. 바람세기조절         조절 짝수 + 홀수 -              " );
			System.out.println("==============================================================");
			System.out.println(">>>사용하실 메뉴 번호를 입력해주세요. (0~7)<<<");
			int select = input.nextInt();
			System.out.println("사용하신 메뉴는 " + select + " 번 입니다");
			
			switch (select) {
			case 0:
				System.out.println("시동 OFF");
				run = false;
				break;
			case 1:
				System.out.println("가속합니다.");
				speed += 10;
				oile -= 1;
				if (speed >= MAXSPEED) {
					speed = MAXSPEED; oile-=3;
				}
				break;
			case 2:
				System.out.println("감속합니다.");
				speed -= 10;
				oile -= 1;
				if (speed <= MINSPEED) {
					speed = MINSPEED;
				}
				break;

			case 3:
				System.out.println("주행모드를 선택해주세요");
				System.out.println("0.ECO MODE   1.COMFORT MODE   2. SPORTS MODE");
				int mod = input.nextInt();
				switch (mod) {
				case '0':
					str = "ECOMODE";
				case '1':
					str = "COMFORTMODE";
				case '2':
					str = "SPORTMODE";
				} // case3 switch 종료
				System.out.println("모드로 전환합니다");
				break;
				
			case 4:
				music += 1;
				if(music >= MAXMUS) {
					music = MAXMUS ;}
				break;
			case 5:
				music -= 1;
				if(music <= MINMUS) {
					music = MINMUS ;}
				break;
				
			case 6:
				ac += 1 ;
				if(ac >= MAXAC) {
					ac = MAXAC ;}
				break;
				
			case 7:
				ac -= 1 ;
				if(ac <= MINAC) {
					ac = MINAC ;}
				break;
				
			case 8:
				System.out.println("기름을 가득 넣었습니다");
				oile = MAXOILE ;
				break;
				
			case 9:
				System.out.println("메뉴를 선택하세요");
				System.out.println("1. 홈화면   2. 네비게이션  3. 통화");
				System.out.println("4. 안드로이드오토   5. 유튜브   6. 블루투스");
				int multi = input.nextInt();
				
				switch(multi) {
				case 1:
					break;
				case 2:
					System.out.println("목적지를 입력해주세요");
					String map = input.next();
					System.out.println(map+"으(로) 안내 시작합니다.");
					break;
				case 3:
					System.out.println("통화하실 연락처를 입력해주세요");
					String call = input.next();
					System.out.println(call+"번호로 통화를 연결합니다.");
					break;
				case 4:
					System.out.println("안드로이드AUTO를 실행합니다.");
					break;
					
				case 5:
					System.out.println("동영상을 실행합니다.");
					break;
					
				case 6:
					System.out.println("연결하실 기기를 선택해주세요.");
					break;
					} // case 9 switch 종료
			} // switch 종료
		} // while 종료
	} // main 종료

} // class 종료
