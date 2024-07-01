package ExFolder;

import java.util.Scanner;

public class ExSwitchChar {

	public static void main(String[] args) {
		// 연습용 회원가입 만들어보기
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("반갑습니다! 기존 회원이신가요?");
		System.out.println("맞으시면 1번 아니시면 2번을 입력해주세요");
		int faceoff = input.nextInt();
		
		switch(faceoff) {
		case 1 :
			System.out.println("본인확인을 도와드리겠습니다. 이름과 전화번호를 적어주세요!");
			System.out.print("성함 : ");
			String name = input.next();
			
			System.out.print("전화번호( - 제외) : ");
			String call = input.next();
			
			System.out.println("반갑습니다 "+ name + " 님!");
			System.out.println("연락처는 " + call + " 에서 변동 없으실까요?");
			System.out.println("변동 없으시면 Yes를 입력해주시고 변동 있으시면 아무거나 입력해주세요");
			String callnum = input.next();
			
			if(callnum.equalsIgnoreCase("yes")) {
				System.out.println("답변 감사합니다. 좋은 하루 보내세요!");
			}else {
				System.out.println("새로운 전화번호를 입력해주세요");
				System.out.print("전화번호 : ");
				String callchange = input.next();
				System.out.println("입력 감사합니다 적어주신 번호");
				System.out.println(callchange +" 으로 번호 변경 완료되었습니다!");
			} // case 1 if문 종료
			break;
		case 2 :
			System.out.println("회원가입을 원하시나요?");
			System.out.println("맞으시면 1번 아니시면 2번을 입력해주세요!");
			int makeit = input.nextInt();
			
			if(makeit == 1) {
				System.out.println("개인정보 및 사용하실 ID와 PW를 입력해주세요!");
				System.out.print("이름 : ");
				String makename = input.next();
				
				System.out.print("주민번호 : ");
				String makessn = input.next();
				
				System.out.print("주소 : ");
				String makeadd = input.next();
				
				System.out.print("전화번호 : ");
				String makecall = input.next();
				
				System.out.print("ID : ");
				String makeid = input.next();
				
				System.out.print("PW : ");
				String makepw = input.next();
				
				System.out.print("Email : ");
				String makemail = input.next();
				
				System.out.println("회원가입 감사합니다. 작성하신 내용 정리해드릴께요!");
				System.out.println("이름 : " + makename);
				System.out.println("주민번호 : " + makessn);
				System.out.println("주소 : " + makeadd);
				System.out.println("전화번호 : " + makecall);
				System.out.println("ID : " + makeid);
				System.out.println("PW : " + makepw);
				System.out.println("Email : " + makemail);
				System.out.println("정보는 잘 보관하겠습니다 감사합니다!");
			}else {
				System.out.println("ㅇㅋ ㅅㄱ");
			} // case 2 if문 종료
		
		} // switch 종료

	} // main 종료

} // class 종료
