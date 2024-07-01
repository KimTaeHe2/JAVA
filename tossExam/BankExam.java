package tossExam;

import java.util.Scanner;

public class BankExam {
	
	private static Scanner input = new Scanner(System.in);
	private static Account[] accountArray = new Account[100];

	public static void main(String[] args) {
		// 은행 프로그램 만들기
		boolean run = true;
		while (run) {
			System.out.println("                   계좌관리 프로그램");
			System.out.println("=================================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("=================================================");
			System.out.print(">>> ");
			int select = input.nextInt();
			switch (select) {
			case 1:
				System.out.println("선택하신 메뉴로 이동합니다.");
				createAccount();
				break;
			case 2:
				System.out.println("선택하신 메뉴로 이동합니다.");
				accountList();
				break;
			case 3:
				System.out.println("선택하신 메뉴로 이동합니다.");
				deposit();
				break;
			case 4:
				System.out.println("선택하신 메뉴로 이동합니다.");
				withdraw();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				default:
					System.out.println("잘못된 입력입니다. 1~5까지 입력해주세요.");
			} // switch 종료
			
		} // while 종료

	} // main 종료
	private static void withdraw() {
		System.out.println("====================");
		System.out.println("   출금 페이지 입니다.");
		System.out.println("====================");
		System.out.println("입금하실분의 계좌번호를 입력해주세요");
		System.out.print("계좌번호 : ");
		String ano = input.next();
		System.out.print("출금액 : ");
		int money = input.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("찾으시는 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()-money);
		System.out.println("출금이 완료되었습니다.");
	} // withdraw 종료

	private static void deposit() {
		System.out.println("====================");
		System.out.println("   예금 페이지 입니다.");
		System.out.println("====================");
		System.out.println("입금하실분의 계좌번호를 입력해주세요");
		System.out.print("계좌번호 : ");
		String ano = input.next();
		System.out.print("예금액 : ");
		int money = input.nextInt();
		Account account = findAccount(ano);
		if(account ==null) {
			System.out.println("찾으시는 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()+money);
		System.out.println("예금이 완료되었습니다.");
	} // deposit 종료

	private static void accountList() {
		System.out.println("    현재 등록되어있는 계좌목록 입니다.");
		System.out.println("====================================");
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (accountArray[i] != null) {
				System.out.println("이름 : ");
				System.out.print(account.getOwner());
				System.out.print("     계좌번호 : ");
				System.out.print(account.getAno());
				System.out.print("       잔액 : ");
				System.out.println(account.getBalance());
				System.out.println();
			} // if 종료
		} // for 종료
	} // list 종료

	private static void createAccount() {

		System.out.println("사용하실 계좌의 정보를 입력해주세요");
		System.out.println("==============================");
		System.out.print("예금주 : ");
		String owner = input.next();
		System.out.print("계좌번호 : ");
		String ano = input.next();
		System.out.println("초기 입금잔액 : ");
		int balance = input.nextInt();

		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println(accountArray[i].getOwner() +"님 계좌 생성이 완료되었습니다.");
				break;
			} // if 종료

		} // for 종료

	} // create 종료

	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				} // if -> if 종료
			} // if 종료
		} // for 종료
		return account;
		
	} // findAccount 종료
} // class 종료
