package ch06.store;

import java.util.Scanner;

public class Member {

	String id;
	String pw;
	String nickName;
	String email;
	boolean blackList;
	
	public Member myInfo(Scanner input, Member[] members) {
		Member info = new Member();
		System.out.println("조회하실 회원 정보를 입력해주세요");
		System.out.print("ID : ");
		info.id = input.next();
		System.out.print("PW : ");
		info.pw = input.next();
		
		for(int i = 0; i < members.length; i++) {
			if(members[i] != null ) {
				if(members[i].id.equals(info.id) && members[i].pw.equals(info.pw)) {
					System.out.println("조회하신 회원 정보는");
					System.out.println("=================================");
					System.out.println("ID : "+members[i].id);
					System.out.println("PW : "+members[i].pw);
					System.out.println("닉네임 : "+members[i].nickName);
					System.out.println("email : "+members[i].email);
				}else {
					System.out.println("찾으시는 정보가 없습니다.");
					break;
				} // if-> if 종료
			}else {
				System.out.println("찾으시는 정보가 없습니다.");
				break;
			} // if 종료
		} // for 종료
		return info;
	} // info 종료
	
	public Member deleteMember(Scanner input, Member[] members) {
		Member delete = new Member();
		System.out.println("회원탈퇴 페이지입니다. 탈퇴하실 회원정보를 입력해주세요.");
		System.out.print("ID : ");
		delete.id = input.next();
		System.out.print("PW : ");
		delete.pw = input.next();

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].id.equals(delete.id) && members[i].pw.equals(delete.pw)) {
					System.out.println("탈퇴하시는 회원 정보");
					System.out.println("ID : " + members[i].id);
					System.out.println("PW : " + members[i].pw);
					System.out.println("닉네임 : " + members[i].nickName);
					System.out.println("email : " + members[i].email);
					System.out.println("입니다. 정말 탈퇴하시나요?");
					System.out.println("1. 예 | 2. 아니요");
					int select = input.nextInt();

					switch (select) {
					case 1:
						members[i] = null;
						System.out.println("탈퇴 완료되었습니다. 이용해주셔서 감사합니다.");
						break;

					case 2:
						System.out.println("전 화면으로 이동합니다.");
						break;

					default:
						System.out.println("잘못된 입력입니다. 1~2까지 입력해주세요.");
					} // switch 종료
				} else {
					System.out.println("잘못된 입력입니다. 다시 확인해주세요.");
					break;
				} // if -> if 종료
			} // if 종료
		} // for 종료
		return delete;
	} // deleteMember 종료

	public Member join(Scanner input, Member[] members) {
		Member newMember = new Member();
		System.out.println("회원가입 페이지 입니다. 사용하실 회원정보를 입력해주세요.");
		System.out.print("ID : ");
		newMember.id = input.next();
		System.out.print("PW : ");
		newMember.pw = input.next();
		System.out.print("닉네임 : ");
		newMember.nickName = input.next();
		System.out.print("email : ");
		newMember.email = input.next();
		for (int i = 0; i < members.length; i++) {
			if(members[i]== null) {
				members[i] = newMember;
				System.out.println(newMember.nickName + " 님 회원가입을 축하합니다!");
				break;
			} // if 종료
		}// for 종료
		return newMember;
	} // newMember 종료

	public Member Correction(Scanner input, Member[] members) {
		Member retouch = new Member();
		System.out.println("정보수정 페이지입니다. 수정하실 회원정보를 입력해주세요");
		System.out.print("ID : ");
		retouch.id = input.next();
		System.out.print("PW : ");
		retouch.pw = input.next();

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].id.equals(retouch.id) && members[i].pw.equals(retouch.pw)) {
					boolean run = true;
					while (run) {
						System.out.println("            수정하실 부분을 입력해주세요");
						System.out.println("===============================================");
						System.out.println("1. ID | 2. PW | 3. 닉네임 | 4. email | 5. 뒤로가기");
						int select = input.nextInt();

						switch (select) {
						case 1:
							System.out.println("현재 사용하시는 ID : " + members[i].id + " 입니다.");
							System.out.println("변경하실 ID를 입력해주세요");
							System.out.print("ID : ");
							retouch.id = input.next();
							members[i].id = retouch.id;
							System.out.println(members[i].id + " 로 변경 완료되었습니다 감사합니다.");
							break;

						case 2:
							System.out.println("현재 사용하시는 PW : " + members[i].pw + " 입니다.");
							System.out.println("변경하실 PW를 입력해주세요");
							retouch.pw = input.next();
							members[i].pw = retouch.pw;
							System.out.println(members[i].pw + "로 변경 완료되었습니다 감사합니다.");
							break;

						case 3:
							System.out.println("현재 사용하시는 닉네임 : " + members[i].nickName + " 입니다.");
							System.out.println("변경하실 닉네임을 입력해주세요.");
							retouch.nickName = input.next();
							members[i].nickName = retouch.nickName;
							System.out.println(members[i].nickName + " 로 변경 완료되었습니다 감사합니다.");
							break;

						case 4:
							System.out.println("현재 사용하시는 email : " + members[i].email + " 입니다.");
							System.out.println("변경하실 email을 입력해주세요.");
							System.out.print("email : ");
							retouch.email = input.next();
							members[i].email = retouch.email;
							System.out.println(members[i].email + " 로 변경 완료되었습니다. 감사합니다.");
							break;

						case 5:
							run = false;
							break;
						default:
							System.out.println("잘못된 입력입니다. 1~5까지 입력해주세요.");

						} // switch 종료

					} // while 종료
				}  // if->if 종료
			} // if 종료
		} // for 종료

		return retouch;
	} // Correction 종료

	public Member user(Scanner input, Member[] members) {
		System.out.println("회원정보를 입력해주세요.");
		Member login = new Member();
		System.out.print("ID : ");
		login.id = input.next();
		System.out.print("PW : ");
		login.pw = input.next();
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].id.equals(login.id) && members[i].pw.equals(login.pw)) {
					System.out.println("환영합니다 " + members[i].nickName + "님 즐거운 하루 되세요");
					break;
				} else {
					System.out.println("잘못된 입력입니다. 회원가입을 도와드릴까요?");
					System.out.println("1. 예 | 2. 아니요");
					int select = input.nextInt();
					switch (select) {
					case 1:
						System.out.println("회원가입 페이지로 이동합니다.");
						Member newMember = join(input, members);
						break;
					case 2:
						break;
						
						default:
							System.out.println("잘못된 입력입니다. 1~2까지 입력해주세요");
					} // switch 종료
				} // if-> if 종료
			} // if 종료
		} // for 종료
		return login;
	} // Login 종료

	public void menu(Scanner input, Member[] members) {
		
		boolean usrun = true;
		while (usrun) {
			System.out.println("                   회원 메뉴입니다");
			System.out.println("=================================================");
			System.out.println("1. 로그인 | 2. 가입 | 3. 정보수정 | 4. 삭제 | 5. Store");
			System.out.println("6. 내정보 | 7. 종료 ");
			System.out.println("=================================================");
			System.out.print(">>> ");
			int select = input.nextInt();

			switch (select) {
			case 1:
				Member login = user(input, members);
				break;
			case 2:
				Member newMember = join(input, members);
				break;
			case 3:
				Member retouch = Correction(input, members);
				break;
			case 4:
				Member delete = deleteMember(input, members);
				break;
			case 5:
				
				break;
				
			case 6:
				Member info = myInfo(input, members);
				break;
			case 7:
				usrun = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 1~5까지 입력해주세요");
			} // switch 종료

		} // while 종료
	} // menu 종료

} // class 종료
