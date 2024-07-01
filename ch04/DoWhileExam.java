package ch04;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// 업엔다운 게임 만들기
		// 컴퓨터가 랜덤 숫자를 생성한다 (1~50)
		// 사용자가 숫자를 입력한다.
		// 컴퓨터가 랜덤숫자를 판단하여 up / down을 알려준다
		// 사용자의 숫자와 컴퓨터의 랜덤숫자가 일치하면 프로그램 종료와 함꼐 당첨 사실을 알린다.
		
		int answer = (int)(Math.random()*50) + 1 ; // 컴퓨터가 랜덤 숫자를 생성한다.(1~50)
		int x = 3; 
		Scanner input = new Scanner(System.in); // 키보드로 입력받는 객체 생성
		
		int question = 0; // 사용자가 입력하는 숫자 보관용
		
		System.out.println("=============================");
		System.out.println("1부터 50사이의 숫자 맞추기 게임.");
		System.out.println("3번 안에 맞출시 상금을 드립니다.");
		System.out.println("==============================");
		
		do {
			System.out.println("1부터 50사이의 숫자를 입력하세요.");

			question = input.nextInt();

			if(question > answer) {
				System.out.println("down");
			}else if(question < answer) {
				System.out.println("Up");
			}
			x+= 1;	
	
			
		} while(question != answer); // do while 종료
		// 랜덤 숫자와 사용자가 입력한 숫자가 같지 않으면 do로 올라감.
		// 랜덤 숫자와 사용자가 입력한 숫자가 같으면 아래로 내려감.
		System.out.println("정답입니다! " + answer);
		System.out.println("고객님은 " + x + "번만에 맞추셨습니다");
		if(x <= 3) {
			System.out.println("상품 수령 : 관리자가 연락을 드립니다");
		}else {
			System.out.println("상품 수령 실패");
		}
	}

}
