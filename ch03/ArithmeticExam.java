package ch03;

public class ArithmeticExam {

	public static void main(String[] args) {
		// 이항 연산자는 2개의 항으로 계산되어 결과를 산출한다
		// 사직연산 + 나머지계산 등에 활용
		// 자동타입 변환으로 큰 타입으로 변경됨
		
		int v1 = 5 ;
		int v2 = 2 ;
		int result1 = v1 + v2 ;
		System.out.println("result1 = " + result1); // 7
		
		int result2 = v1 - v2 ;
		System.out.println("result2 = " + result2); // 3
		
		int result3 = v1 * v2 ;
		System.out.println("result3 = " + result3); // 10
		
		int result4 = v1 / v2 ;
		System.out.println("result4 = " + result4); // 2
		
		int result5 = v1 % v2 ;
		System.out.println("result5 = " + result5); // 1 (나머지)
		
		double result6 = v1 / v2 ;
		System.out.println("result6 = " + result6);
		
		double result7 =(double) v1 / v2 ; // 강제타입변환 + 자동타입변환 활용
		System.out.println("result7 = " + result7);
		// 나누기 할때 주의사항 소수점 계산
		
		int x = 1000000 ;
		int y = 1000000 ;
		int z = x * y ;
		System.out.println("백만 * 백만 + " + z);
		
		long zl = (long) x * y ;
		System.out.println("long 강제 + 자동타입 변환 : " + zl);
		
		System.out.println("소수점 정확한 계산은 float, double?");
		// 정확한 계산은 부동소수점(실수) 타입은 사용하지 않는 것이 좋다.
		// 사과 1개를 0.1 단위인 10조각으로 보고(piece) 그 중 7개의 조각(0.7)을 뺀 3조각 (0.3)계산
		
		float apple = 1 ;
		double pieceUnit = 0.1 ; // 사과 1조각(10등분)
		int piece = 7 ; // 먹은 조각수
		double result = apple - (piece * pieceUnit) ;
		System.out.println("남은 사과 조각수 = " + result);
		// 돈계산할 때는 double과 같은 실수형으로 사용하지 말 것!
		
		System.out.println("====================");
		
		int appleInt = 1; //사과 1개
		int totalPices = appleInt * 10 ; // 10등분으로 나누지 말고 곱한다
		int number = 7 ; // 사과 7조각을 표현
		int temp = totalPices - number ; // 사과 10조각 - 7조각 = 3조각
		double resultInt = temp / 10.0 ; // 3 / 10.0 = 0.3
		System.out.println("사과 1개에서 0.7 조각을 빼면 :" + resultInt);
		
		int eng = 90 ;
		int sol = 80 ;
		int total = eng + sol ;
		System.out.println("영어점수 : " + eng);
		System.out.println("사회점수 : " + sol);
		System.out.println("총점 : " + total);
		System.out.println((90+80) / 2 + " : 평균 ");
		// 출력시 앞 글자가 문자이면 뒤에 숫자는 자동 타입 변환으로 문자열 출력
		// 출력시 앞 글자가 계산 정보이면 계산 후에 문자열이 붙는다.

	}

}
