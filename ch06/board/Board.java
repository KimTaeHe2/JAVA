package ch06.board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Board { // Board 객체용
	// 필드
	int bno; // 게시물 번호
	String title; // 게시물 제목
	String content; // 내용
	String nickName; // 별명(작성자)
	Date regDate; // 작성일

	/*
	 * public Board time(Board[] boards) { Board regDate = new Board();
	 * LocalDateTime now = LocalDateTime.now(); String formatedNow =
	 * now.format(DateTimeFormatter.ofPattern ("yyyy년 MM월 dd일 HH시 mm분 ss초"));
	 * for(int i = 0; i < boards.length; i++) { boards[i].regDate = regDate; } //
	 * for 종료 return regDate; } // time 종료
	 */

	public Board correction(Scanner input, Board[] boards) {
		Board upDate = new Board();
		System.out.println("수정하실 게시물의 번호를 입력해주세요");
		upDate.bno = input.nextInt();
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].bno == upDate.bno) {
				boolean uprun = true;
				while (uprun) {
					System.out.println("수정하실 부분의 번호를 입력해주세요");
					System.out.println("1. 제목 | 2. 내용  | 3. 게시물 번호 | 4. 뒤로가기");
					int select = input.nextInt();
					switch (select) {
					case 1:
						System.out.println("변경하실 제목을 입력해주세요");
						upDate.title = input.next();
						boards[i] = upDate;
						System.out.println("변경이 완료되었습니다");
						break;

					case 2:
						System.out.println("변경하실 내용을 입력해주세요");
						upDate.content = input.next();
						boards[i] = upDate;
						System.out.println("변경이 완료되었습니다.");
						break;

					case 3:
						System.out.println("변경하실 게시물 번호를 입력해주세요");
						upDate.bno = input.nextInt();
						boards[i] = upDate;
						System.out.println("변경이 완료되었습니다.");
						break;

					case 4:
						uprun = false;
						break;
					default:
						System.out.println("1~4값을 입력해주세요");

					} // switch 종료
					
				} // while 종료
			} else{
				System.out.println("수정하실 게시물이 없습니다.");
			} // if 종료
		} // for 종료
		return upDate;
	} // correction 종료

	public Board writeapost(Scanner input, Board[] boards) {
		Board newPost = new Board();
		Board regDate = new Board();
		System.out.println("작성일 : " + regDate);
		System.out.print("게시물 번호 : ");
		newPost.bno = input.nextInt();
		System.out.print("제목 : ");
		newPost.title = input.next();
		System.out.print("작성자 : ");
		newPost.nickName = input.next();
		System.out.println("내용 : ");
		newPost.content = input.next();

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = newPost;
				System.out.println("작성이 완료되었습니다.");
				break;
			} // for ->if 종료
		} // for 종료
		return newPost;
	} // Write a post 종료

	public Board deletepost(Scanner input, Board[] boards) {
		Board delPost = new Board();
		System.out.println("삭제하실 게시물의 번호를 입력해주세요");
		delPost.bno = input.nextInt();
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				if (boards[i].bno == delPost.bno) {
					boards[i] = null;
					System.out.println("삭제가 완료되었습니다.");
					break;
				}
			} else {
				System.out.println("삭제할 게시물이 없습니다.");
				break;
			} // if 종료
		} // for 종료

		return delPost;
	}// deletepost 종료

	public Board viewpost(Board[] boards) {
		Board view = new Board();
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				// System.out.println("작성일 : "+boards[i].regDate);
				System.out.println("번호 : " + boards[i].bno);
				System.out.println("제목 : " + boards[i].title);
				System.out.println("닉네임 : " + boards[i].nickName);
				System.out.println("내용 : \n" + boards[i].content);
				System.out.println("===========================");
			} // if 종료
		} // for 종료
		return view;
	} // viewpost 종료

	public void menu(Scanner input, Board[] boards) {
		boolean run = true;
		while (run) {
			System.out.println("1. 작성 | 2. 보기 | 3. 수정 |4. 삭제 | 5. 종료");
			System.out.print(">>> ");
			int select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("게시물 작성");
				Board newPost = writeapost(input, boards);
				break;
			case 2:
				System.out.println("===============게시물===============");
				Board view = viewpost(boards);
				break;
			case 3:
				Board upDate = correction(input, boards);
				break;
			case 4:
				Board delPost = deletepost(input, boards);
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("1~5값만 입력해주세요");
			} // switch 종료
		} // while 종료
	} // menu 종료
} // class 종료
