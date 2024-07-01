package ExFolder;

import java.util.Scanner;

public class ExStatic {
	private static final int String = 0;

			  // 계산기 만들기
			   // main : 1. 더하기 / 2. 빼기 / 3. 곱하기 / 4. 나누기 / 5. 나머지
			   // main 메서드와 분리하여 작성
			   public static void main(String[] args) {

			      System.out.println("============= 계산기 ===========");
			      System.out.println("             기능보기           ");
			      System.out.println("더하기 / 빼기 / 곱하기 / 나누기 / 나머지");
			      System.out.println("==============================");
			      Scanner input = new Scanner(System.in);
			      Scanner insign = new Scanner(System.in);
			      boolean cal = true;
			      while (cal) {
			         System.out.println("첫번째 숫자를 입력하세요.");
			         int num1 = input.nextInt(); // 입력받은 숫자 저장      
			         System.out.println("연산자를 입력하세요.");
			         String sign = insign.next(); // 입력받는 기호 저장
			         System.out.println("두 번째 숫자를 입력하세요.");
			         int num2 = input.nextInt(); // 입력받은 숫자 저장
			         int fresult = 0; // 최종 결과값

			         /* logic 메서드 */
			         switch (sign) {
			         case "+":
			            fresult = plus(num1, num2);
			            break;
			         case "-":
			            fresult = minus(num1, num2);
			            break;
			         case "*":
			            fresult = multi(num1, num2);
			            break;
			         case "/":
			            fresult = division(num1, num2);
			            break;
			         case "%":
			            fresult = rest(num1, num2);
			            break;
			         default:
			            System.out.println("시스템 오류입니다. 다시 입력해 주세요.");
			         }
			         System.out.println(num1 + sign + num2 + " = " + fresult);
			         System.out.println("계속하시겠습니까?");
			         System.out.print("계속 : 1 / 그만하기 2>>>");
			         int sel = input.nextInt();
			         if(sel==1) {
			            cal = true;
			         } else {
			            cal=false;
			         }
			         

			      }

			      input.close();
			      insign.close();
			      
			   } // main()종료

			   /* 더하기 메서드 */
			   static int plus(int x, int y) {
			      int result = 0;
			      result = x + y;
			      return result;
			   }

			   /* 빼기 메서드 */
			   static int minus(int x, int y) {
			      int result = 0;
			      result = x-y;
			      return result;
			   }

			   /* 곱하기 메서드 */
			   static int multi(int x, int y) {
			      int result = 0;
			      result = x*y;
			      return result;
			   }

			   /* 나누기 메서드 */
			   static int division(int x, int y) {
			      int result = 0;
			      result = x/y;
			      return result;
			   }

			   /* 나머지 메서드 */
			   static int rest(int x, int y) {
			      int result = 0;
			      result = x%y;
			      return result;
			   }

			} // class종료

