package ch06.store;

import java.util.Scanner;

public class Admin {

	String adid;
	String adpw;

	public Admin newAdmin(Scanner input, Admin[] admins) {
		Admin add = new Admin();
		boolean run = true;
		while (run) {
			System.out.println("Admin 관리 페이지 입니다.");
			System.out.println("==========================================================");
			System.out.println("1. 관리자 추가 | 2. 관리자 보기 | 3. ID & PW 수정 | 4. 관리자 삭제");
			System.out.println("5. 뒤로가기");
			System.out.println("===========================================================");
			System.out.print(">>> ");
			int select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("관리자 추가 페이지입니다. 추가하실 관리자 ID/PW를 입력해주세요");
				System.out.println("관리자 ID는 최대 5개까지 생성 가능합니다.");
				System.out.print("ID : ");
				add.adid = input.next();
				System.out.print("PW : ");
				add.adpw = input.next();
				for (int i = 0; i < admins.length; i++) {
					if (admins[i] == null) {
						admins[i] = add;
						System.out.println(add.adid + "관리자가 추가되었습니다.");
						break;
					} // if 종료
				} // for 종료
				break;

			case 2:
				System.out.println("현재 등록되어있는 관리자 입니다.");
				System.out.println("=============================");
				for (int i = 0; i < admins.length; i++) {
					if (admins[i] != null) {
						System.out.println(admins[i].adid);
					} // if 종료
				} // for 종료
				break;

			case 3:
				System.out.println("관리자 수정 페이지 입니다.");
				System.out.println("수정하실 관리자의 ID / PW를 입력해주세요");
				System.out.print("ID : ");
				add.adid = input.next();
				System.out.print("PW : ");
				add.adpw = input.next();

				for (int i = 0; i < admins.length; i++) {
					if (admins[i] != null) {
						if (admins[i].adid.equals(add.adid) && admins[i].adpw.equals(add.adpw)) {
							System.out.println("수정하실 내용을 입력해주세요");
							System.out.println("1. ID | 2. PW");
							System.out.print(">>> ");
							int correction = input.nextInt();
							switch (correction) {
							case 1:
								System.out.println("현재 사용중인 ID는 " + admins[i].adid + " 입니다.");
								System.out.println("변경하실 ID 를 입력해주세요");
								System.out.print("ID : ");
								add.adid = input.next();
								admins[i] = add;
								System.out.println("변경이 완료되었습니다.");
								break;

							case 2:
								System.out.println("현재 사용중인 PW는 " + admins[i].adpw + " 입니다.");
								System.out.println("변경하실 PW 를 입력해주세요");
								System.out.print("PW : ");
								add.adpw = input.next();
								admins[i] = add;
								System.out.println("변경이 완료되었습니다.");
								break;

							default:
								System.out.println("잘못된 입력입니다. 1~2까지 입력해주세요");
							} // switch 종료
						} else {
							System.out.println("잘못된 입력입니다. 다시 확인해주세요");
							
						} // if -> if 종료
					} // if 종료
					
				} // for 종료
				break;

			case 4:
				System.out.println("관리자 삭제 페이지 입니다.");
				System.out.println("삭제하실 관리자의 ID / PW를 입력해주세요");
				System.out.print("ID : ");
				add.adid = input.next();
				System.out.print("PW : ");
				add.adpw = input.next();
				for (int i = 0; i < admins.length; i++) {
					if (admins[i] != null) {
						if (admins[i].adid.equals(add.adid) && admins[i].adpw.equals(add.adpw)) {
							System.out.println("삭제하실 관리자 ID는 " + admins[i].adid + "입니다.");
							System.out.println("정말 삭제하시겠습니까?");
							System.out.println("1. 예 | 2. 아니요");
							int delete = input.nextInt();
							switch (delete) {
							case 1:
								admins[i] = null;
								System.out.println("ID가 삭제되었습니다.");
								break;
							case 2:
								System.out.println("전 화면으로 이동합니다.");
								break;
							default:
								System.out.println("잘못된 입력입니다. 1~2까지 입력해주세요");
							} // switch 종료

						} else {
							System.out.println("잘못된 입력입니다. 다시 확인해주세요");
							break;
						} // if -> if 종료
					} // if 종료
				} // for 종료
				break;

			case 5:
				run = false;
				break;

			default:
				System.out.println("잘못된 입력입니다. 1~5까지 입력해주세요");
			} // switch 종료
		} // while 종료
		return add;
	} // Admin 종료

	public Member memberList(Member[] members) {
		Member memlist = new Member();

		System.out.println("가입되어있는 회원 목록입니다.");
		System.out.println("==================================");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				System.out.println(members[i].id + "  " + members[i].nickName + "  " + members[i].email);
			} // if 종료
		} // for 종료
		return memlist;
	} // memberList 종료

	public Member Correction(Scanner input, Member[] members) {
		Member retouch = new Member();
		System.out.println("회원정보수정 페이지입니다. 수정하실 회원의 ID를 입력해주세요");
		System.out.print("ID : ");
		retouch.id = input.next();

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].id.equals(retouch.id)) {
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
							System.out.println(members[i].id + " 로 변경 완료되었습니다.");
							break;

						case 2:
							System.out.println("현재 사용하시는 PW : " + members[i].pw + " 입니다.");
							System.out.println("변경하실 PW를 입력해주세요");
							System.out.print("PW : ");
							retouch.pw = input.next();
							members[i].pw = retouch.pw;
							System.out.println(members[i].pw + "로 변경 완료되었습니다.");
							break;

						case 3:
							System.out.println("현재 사용하시는 닉네임 : " + members[i].nickName + " 입니다.");
							System.out.println("변경하실 닉네임을 입력해주세요.");
							System.out.print("닉네임 : ");
							retouch.nickName = input.next();
							members[i].nickName = retouch.nickName;
							System.out.println(members[i].nickName + " 로 변경 완료되었습니다.");
							break;

						case 4:
							System.out.println("현재 사용하시는 email : " + members[i].email + " 입니다.");
							System.out.println("변경하실 email을 입력해주세요.");
							System.out.print("email : ");
							retouch.email = input.next();
							members[i].email = retouch.email;
							System.out.println(members[i].email + " 로 변경 완료되었습니다.");
							break;

						case 5:
							run = false;
							break;
						default:
							System.out.println("잘못된 입력입니다. 1~5까지 입력해주세요.");

						} // switch 종료

					} // while 종료
				} else {
					System.out.println("잘못된 입력입니다 다시 확인해주세요.");
					break;
				} // if->if 종료
			} // if 종료
		} // for 종료
		return retouch;
	} // Correction 종료

	public Member blackList(Scanner input, Member[] members) {
		Member black = new Member();
		boolean run = true;
		while (run) {
			System.out.println("블랙리스트 페이지 입니다. 사용하실 번호를 입력해주세요");
			System.out.println("1. 블랙리스트 보기 | 2. 블랙리스트 추가 | 3. 블랙리스트 삭제 | 4. 뒤로가기");
			System.out.print(">>> ");
			int select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("   현재까지의 블랙리스트 입니다.");
				System.out.println("==============================");
				for (int i = 0; i < members.length; i++) {
					if (black.blackList == true) {
						System.out.println(black.nickName);
						break;
					} // if 종료
				} // for 종료
				break;

			case 2:
				System.out.println("블랙리스트로 추가하실 회원의 닉네임을 입력해주세요");
				System.out.print("닉네임 : ");
				black.nickName = input.next();

				for (int i = 0; i < members.length; i++) {
					if (members[i].nickName.equals(black.nickName)) {
						black.blackList = true;
						System.out.println(members[i].nickName + " 님이 블랙리스트로 추가되었습니다.");
						break;	
					} // if 종료
				} // for 종료
				break;

			case 3:
				System.out.println("블랙리스트에서 삭제하실 회원의 닉네임을 입력해주세요");
				System.out.print("닉네임 : ");
				black.nickName = input.next();

				for (int i = 0; i < members.length; i++) {
					if (members[i].nickName.equals(black.nickName)) {
						black.blackList = false;
						System.out.println(members[i].nickName + " 님이 블랙리스트에서 삭제되었습니다.");
						break;
					} // if 종료
				} // for 종료
				break;
				
			case 4:
				run = false;
				break;

			default:
				System.out.println("잘못된 입력입니다. 1~4까지 입력해주세요");
			} // switch 종료
		} // while 종료

		return black;
	} // blackList 종료

	public Member exileMember(Scanner input, Member[] members) {
		Member exile = new Member();
		System.out.println("회원추방 페이지입니다. 탈퇴하실 회원정보를 입력해주세요.");
		System.out.print("ID : ");
		exile.id = input.next();

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].id.equals(exile.id)) {
					System.out.println("추방하시는 회원 정보");
					System.out.println("ID : " + members[i].id);
					System.out.println("PW : " + members[i].pw);
					System.out.println("닉네임 : " + members[i].nickName);
					System.out.println("email : " + members[i].email);
					System.out.println("입니다. 정말 추방하시나요?");
					System.out.println("1. 예 | 2. 아니요");
					int select = input.nextInt();

					switch (select) {
					case 1:
						members[i] = null;
						System.out.println("추방 완료되었습니다.");
						break;
						
					case 2:
						System.out.println("전 화면으로 이동합니다.");
						break;
						
					default:
						System.out.println("잘못된 입력입니다. 1~2까지 입력해주세요.");
					} // switch 종료
				}else {
					System.out.println("잘못된 입력입니다. 다시 확인해주세요.");
					break;
				} // if -> if 종료
			} // if 종료
		} // for 종료
		return exile;
	} // deleteMember 종료

	public Commodity registration(Scanner input, Commodity[] goods) {
		Commodity prouduct = new Commodity();
		boolean run = true;
		while (run) {
			System.out.println("  상품관리 페이지입니다. 사용하실 번호를 입력해주세요.");
			System.out.println("==============================================");
			System.out.println("1. 등록 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 뒤로가기");
			System.out.println("==============================================");
			System.out.print(">>> ");
			int select = input.nextInt();
			switch (select) {
			case 1:
				System.out.println("상품등록 페이지 입니다. 등록하실 상품의 내용을 입력해주세요");
				System.out.print("상품번호 : ");
				prouduct.productNum = input.next();
				System.out.print("상품명 : ");
				prouduct.productName = input.next();
				System.out.print("가격 : ");
				prouduct.productprice = input.next();
				System.out.println("상품설명 : ");
				prouduct.explanation = input.next();

				for (int i = 0; i < goods.length; i++) {
					if (goods[i] == null) {
						goods[i] = prouduct;
						System.out.println("상품 등록이 완료되었습니다.");
						break;
					} else {
						System.out.println("빈칸이 없습니다. 확장시켜주세요.");
					} // if 종료
				} // for 종료
				break;

			case 2:
				System.out.println("현재 등록 되어있는 상품 목록입니다.");
				System.out.println("=============================");
				for (int i = 0; i < goods.length; i++) {
					if (goods[i] != null) {
						System.out.println("상품번호 : " + goods[i].productNum);
						System.out.println("상품명 : " + goods[i].productName);
						System.out.println("가격 : " + goods[i].productprice);
						System.out.println("상품설명 \n" + goods[i].explanation);
					} // if 종료
				} // for 종료
				break;
			case 3:
				System.out.println("수정하실 상품의 품번을 입력해주세요.");
				System.out.println("상품번호 : ");
				prouduct.productNum = input.next();
				for (int i = 0; i < goods.length; i++) {
					if (goods[i] != null) {
						if (goods[i].productNum.equals(prouduct.productNum)) {
							boolean exit = true;
							while (exit) {
								System.out.println("수정하실 상품의 내용을 입력해주세요.");
								System.out.println("1. 상품번호 | 2. 제목 | 3. 가격 | 4. 상품설명");
								System.out.println("5. 뒤로가기");
								int correction = input.nextInt();

								switch (correction) {
								case 1:
									System.out.println("현재 사용중인 상품번호는 " + goods[i].productNum + " 입니다.");
									System.out.println("변경하실 상품번호를 입력해주세요");
									System.out.print("상품번호 : ");
									prouduct.productNum = input.next();
									goods[i] = prouduct;
									System.out.println(goods[i].productNum + " 으로 변경 완료되었습니다.");
									break;
								case 2:
									System.out.println("현재 사용중인 제목 " + goods[i].productName + " 입니다.");
									System.out.println("변경하실 제목을 입력해주세요");
									System.out.print("제목 : ");
									prouduct.productName = input.next();
									goods[i] = prouduct;
									System.out.println(goods[i].productName + " 으로 변경 완료되었습니다.");
									break;
								case 3:
									System.out.println("현재 사용중인 가격은 " + goods[i].productprice + " 입니다.");
									System.out.println("변경하실 가격을 입력해주세요");
									System.out.print("가격 : ");
									prouduct.productprice = input.next();
									goods[i] = prouduct;
									System.out.println(goods[i].productprice + " 으로 변경 완료되었습니다.");
									break;
								case 4:
									System.out.println("현재 사용중인 설명은 " + goods[i].explanation + " 입니다.");
									System.out.println("변경하실 설명을 입력해주세요");
									System.out.print("설명 : ");
									prouduct.explanation = input.next();
									goods[i] = prouduct;
									System.out.println(goods[i].explanation + " 으로 변경 완료되었습니다.");
									break;
								case 5:
									System.out.println("전 화면으로 이동합니다.");
									break;
								default:
									System.out.println("잘못된 입력입니다. 1~5까지 입력해주세요.");
								} // switch 종료

							} // while 종료
						} // if -> if 종료
					} // if 종료
				} // for 종료
				break;
			case 4:
				System.out.println("삭제하실 상품의 품번을 입력해주세요.");
				System.out.print("상품번호 : ");
				prouduct.productNum = input.next();
				for (int i = 0; i < goods.length; i++) {
					if (goods[i] != null) {
						if (goods[i].explanation.equals(prouduct.productNum)) {
							System.out.println("삭제하실 상품 내용은");
							System.out.println("상품번호 : " + goods[i].productNum);
							System.out.println("상품명 : " + goods[i].productName);
							System.out.println("가격 : " + goods[i].productprice);
							System.out.println("입니다 정말 삭제하시겠습니까?");
							System.out.println("1. 예 | 2. 아니요");
							int delete = input.nextInt();

							switch (delete) {
							case 1:
								System.out.println("상품번호 : " + goods[i].productNum);
								System.out.println("상품명 : " + goods[i].productName);
								System.out.println("가격 : " + goods[i].productprice);
								goods[i] = null;
								System.out.println("상품이 삭제되었습니다.");
								break;

							case 2:
								System.out.println("전 화면으로 이동합니다.");
								break;

							default:
								System.out.println("잘못된 입력입니다. 1~2까지 입력해주세요");
							} // switch 종료

						} // if -> if 종료
					} // if 종료
				} // for 종료
				break;
			case 5:
				run = false;
				break;

			default:
				System.out.println("잘못된 입력입니다. 1~5까지 입력해주세요.");
			} // switch 종료

		} // while 종료
		return prouduct;
	} // prouduct 종료

	public Member members(Scanner input, Member[] members) {
		Member mem = new Member();
		boolean run = true;
		while (run) {
			System.out.println("회원관리 페이지 입니다. 사용하실 번호를 입력해주세요");
			System.out.println("================================================");
			System.out.println("1. 회원보기 | 2. 회원설정 | 3. 블랙리스트 | 4. 회원추방 ");
			System.out.println("5. 뒤로가기");
			System.out.println("================================================");
			System.out.print(">>> ");
			int select = input.nextInt();

			switch (select) {
			case 1:
				Member memlist = memberList(members);
				break;

			case 2:
				Member retouch = Correction(input, members);
				break;

			case 3:
				Member black = blackList(input, members);
				break;

			case 4:
				Member exile = exileMember(input, members);
				break;

			case 5:
				run = false;
				break;

			default:
				System.out.println("잘못된 입력입니다. 1~5까지 입력해주세요");

			} // switch 종료
		} // while 종료
		return mem;
	}// members 종료

	public void menu(Scanner input, Commodity[] goods, Member[] members, Admin[] admins) {
		Admin admin1 = new Admin();
		admin1.adid = "김태희";
		admin1.adpw = "111";
		admins[0] = admin1;

		Admin ad = new Admin();
		System.out.println("관리자 페이지 입니다. 관리자 정보를 입력해주세요");
		System.out.print("ID : ");
		ad.adid = input.next();
		System.out.print("PW : ");
		ad.adpw = input.next();
		for (int i = 0; i < admins.length; i++) {
			if (admins[i] != null) {
				if (admins[i].adid.equals(ad.adid) && admins[i].adpw.equals(ad.adpw)) {
					boolean run = true;
					while (run) {
						System.out.println("사용하실 항목 번호를 입력해주세요");
						System.out.println("================================================");
						System.out.println("1. 상품관리 | 2. 회원관리 | 3. Admin 관리 | 4. 뒤로가기");
						System.out.println("================================================");
						System.out.print(">>> ");
						int select = input.nextInt();
						switch (select) {
						case 1:
							Commodity prouduct = registration(input, goods);
							break;
						case 2:
							Member mem = members(input, members);
							break;
						case 3:
							Admin add = newAdmin(input, admins);
							break;
						case 4:
							run = false;
							break;
						default:
							System.out.println("잘못입력하셨습니다. 1~4까지 입력해주세요");
						} // switch 종료

					} // while 종료

				} else {
					System.out.println("잘못된 입력입니다 다시 입력해주세요.");
					break;
				} // if-> if 종료
			} // if 종료
		} // for 종료
	} // menu 종료

} // class 종료
