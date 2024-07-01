package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.DTO.Account;

public class LoginService {
	// 로그인에 관한 부메뉴 용
	
	public static Account menu(Scanner scanner, Account[] accounts, Account loginAccount) {
		System.out.println("=============================================");
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 회원수정 | 4. 뒤로가기");
		System.out.println("=============================================");
		System.out.print(">>> ");
		int select = scanner.nextInt();
		switch(select) {
		case 1:
			System.out.println("회원 정보를 입력해주세요.");
			System.out.print("ID : ");
			String id = scanner.next();
			System.out.print("PW : ");
			String pw = scanner.next();
			Account account = new Account();
			account.setId(id);
			account.setPw(pw); // 새로만든 account 객체에 id.pw 삽입
			for(int i = 0; i < accounts.length; i++) {
				if(accounts[i] != null) {
					if(accounts[i].getId().equals(account.getId())) {
						System.out.println("해당하는 ID가 있습니다.");
						if(accounts[i].getPw().equals(account.getPw())) {
							System.out.println("해당하는 PW가 있습니다.");
							loginAccount = accounts[i];
							System.out.println("로그인 성공");
							break;
						}else {
							System.out.println("해당하는 PW가 없습니다.");
						} // PW 비교 종료
					}else {
						System.out.println("해당하는 ID가 없습니다.");
					} // ID 비교 종료
				}else {
					System.out.println("해당하는 회원이 없습니다.");
					break;
				}// 공백 비교 종료
					
					
					
			} // for 종료
			break;
		case 2:
			System.out.println("사용하실 회원 정보를 입력해주세요.");
			break;
		case 3:
			System.out.println("사용하실 회원 정보를 입력해주세요.");
			break;
		case 4:
			System.out.println("사용하실 회원 정보를 입력해주세요.");
			break;
			
		} // switch 종료
		
		return loginAccount;
	} // menu 종료
} // class 종료
