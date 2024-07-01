package ch06.board;

import java.util.Scanner;

public class Member { // 회원에 대한 CRUD 구현
	// 필드 -> 멤버변수
	String id;
	String pw;
	String nickName;
	String email;

	// 생성자 -> new 로 객체 생성시 사용(생략시 기본생성자가 자동으로 만들어짐)
	// Member member = new Member();

	// 메서드 -> 동작(CRUD)

	public Member register(Scanner input) {
		// 새로운 Member 객체를 생성하여 키보드로 넣은 필드값을 삽입하고 객체로 리턴
		Member newMember = new Member();
		System.out.print("ID : ");
		newMember.id = input.next();
		System.out.print("PW : ");
		newMember.pw = input.next();
		System.out.print("닉네임 : ");
		newMember.nickName = input.next();
		System.out.print("이메일 : ");
		newMember.email = input.next();
		return newMember;
	} // register 종료

	public Member login(Scanner input, Member[] members) {
		//         매개값     키보드 입력      회원배열
		System.out.println("로그인을 시작합니다.");
		Member loginMember = new Member(); // 키보드로 입력한 객체 생성
		System.out.print("ID : ");
		loginMember.id = input.next();
		System.out.print("PW : ");
		loginMember.pw = input.next();
		
		// 배열에 있는 객체와 새로만든 객체 비교 시작
		for(int i = 0 ; i < members.length; i++) {
			if(members[i] != null) { // 배열에 빈칸이 아니면
				if(members[i].id.equals(loginMember.id) // 입력한 ID,PW와 객체이 있는 값 비교 
				&& members[i].pw.equals(loginMember.pw)) {
					// loginMember 2개의 값 members[i] 4개의 값
					loginMember = members[i]; // 교체
					System.out.println(loginMember.nickName+" 님 환영합니다");
					break;
				} // if -> if 종료 (ID PW 비교 -> 객체 변경)
			} else{
				System.out.println("회원정보가 없습니다.");
				System.out.println("ID / PW를 확인하세요.");
				break;
			}// for -> if 종료
		} // for 종료
		
		
		return loginMember;
	} // login 종료

	public Member modify(Scanner input, Member[] members) {
		System.out.println("회원정보 수정을 시작합니다.");
		System.out.println("수정하실 회원의 ID / PW 입력해주세요");
		Member modifyMember = new Member();
		System.out.print("ID : ");
		modifyMember.id = input.next();
		System.out.print("PW : ");
		modifyMember.pw = input.next();
		for(int i = 0; i < members.length; i++) {
			if(members[i] != null) {
				if(members[i].id.equals(modifyMember.id) && 
						members[i].pw.equals(modifyMember.pw)) {
					System.out.println("변경하실 PW를 입력해주세요");
					modifyMember.pw = input.next();
					members[i].pw = modifyMember.pw;
					System.out.println("PW 변경이 완료되었습니다");
					break;
				} // if -> if 종료
			} // for -> if 종료
		} // for 종료
		return modifyMember;
	} // modify 종료

	public Member delete(Scanner input, Member[] members) {
		System.out.println("회원 탈퇴를 시작합니다.");
		System.out.println("사용하시는 ID / PW 를 입력해주세요");
		Member deleteMember = new Member();
		System.out.print("ID : ");
		deleteMember.id = input.next();
		System.out.print("PW : ");
		deleteMember.pw = input.next();
		
		for(int i = 0; i < members.length; i++) {
			if(members[i] != null) {
				if(members[i].id.equals(deleteMember.id) &&
					members[i].pw.equals(deleteMember.pw)) {
					System.out.println("탈퇴 완료되었습니다. 감사합니다");
					members[i] = null;
					break;
				}else {
					System.out.println("잘못된 입력입니다 다시 입력해주세요");
					break;
				}// if -> if 종료
			} // for -> if 종료
		} //for 종료
		return deleteMember;
	} // delete 종료

	public void menu(Scanner input, Member[] members) {
		boolean run = true;
		while (run) {

			System.out.println("============ 회원 전용 메뉴 입니다. ============");
			System.out.println("1. 가입 | 2. 로그인 | 3. 수정 | 4. 탈퇴 | 5. 종료");
			System.out.print(">>> ");
			int select = input.nextInt();
			switch (select) {
			
			case 1:
				System.out.println("회원가입을 진행합니다.");
				Member newMember = register(input);
				// 키보드로 입력받을 필드 완성후 객체로 받음
				// 멤버배열 null을 찾아 삽입
				for(int i = 0; i < members.length; i++) {
					if(members[i] == null) {
						members[i] = newMember;
						System.out.println(newMember.nickName +"객체가 배열에 저장됨");
						break;
					}
				}// for 종료
				break;
			case 2:
				Member loginMember = login(input, members); // 호출시 스캐너와 배열 객체 전달
				break;
			case 3:
				System.out.println("수정작업을 진행합니다.");
				Member modifyMember =modify(input, members);
				break;
			case 4:
				System.out.println("탈퇴를 진행합니다.");
				Member deleteMember = delete(input, members);
				break;
			case 5:
				System.out.println("회원전용 메뉴를 종료합니다.");
				run = false;
				break;
				
				default:
					System.out.println("1~5값만 입력해주세요.");
			} // switch 종료

		} // while 종료

	} // menu 종료
} // class 종료
