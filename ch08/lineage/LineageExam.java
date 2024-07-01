package ch08.lineage;

import java.util.Scanner;

import ch08.lineage.DTO.Account;
import ch08.lineage.DTO.ElfDTO;
import ch08.lineage.DTO.HumanDTO;
import ch08.lineage.DTO.KnightDTO;
import ch08.lineage.service.CharacterService;
import ch08.lineage.service.LoginService;

public class LineageExam {

	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[10]; 		// 로그인용 배열
	public static Account loginAccount; 						// 로그인 성공시 객체
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	public static HumanDTO humanDTO = null;
	
	static {
		knightDTO.setSword("양손검");
		knightDTO.setArmor("황금갑옷");
		knightDTO.setShield("아메리카방패");
		knightDTO.setName("양기사");
		knightDTO.setSex("남자");
		knightDTO.setLevel("50");
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000);

		elfDTO.setBow("양손활");
		elfDTO.setDress("천사드레스");
		elfDTO.setArrow("크리티컬 화살");
		elfDTO.setName("저요정");
		elfDTO.setSex("여자");
		elfDTO.setLevel("30");
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(9999999);

		Account account = new Account();
		account.setId("김태희");
		account.setPw("123");
		account.setNickName("태희");
		accounts[0] = account; // 테스트용 계정 생성
	} // db 대신 초기값 지정(생성자 대신)

	public static void main(String[] args) {
		// 객체 간의 상속을 알아 본다.
		// 부모 객체에서 자식 객체에게 모든 정보를 상속한다
		// 자식 객체는 부모 객체의 정보를 받아 사용하며 추가적인 정보를 생성하여 활용한다

		System.out.println("                    리니지");
		boolean run = true;
		while (run) {
			System.out.println("=============================================");
			System.out.println("1. 회원관리 | 2. 캐릭터 선택 | 3. 게임실행 | 4. 종료");
			System.out.println("=============================================");
			System.out.print(">>> ");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("회원관리 화면 입니다.");
				loginAccount = LoginService.menu(scanner, accounts, loginAccount);
				break;
			case 2:
				System.out.println("          사용하실 캐릭터를 선택해주세요.");
				CharacterService.menu(scanner, loginAccount, knightDTO, elfDTO, humanDTO);
				break;
			case 3:
				System.out.println("게임을 실행합니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				default :
					System.out.println("잘못된 입력입니다. 1~4까지 입력해주세요");
			} // switch 종료

		} // while 종료
	} // main 종료

} // class 종료
