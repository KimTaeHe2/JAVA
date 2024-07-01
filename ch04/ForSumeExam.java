package ch04;

public class ForSumeExam {

	public static void main(String[] args) {
		// 1~100까지의 합을 구하시오!!! -> 5050
		
		int i = 1 ; // 반복용 변수
		int sum = 0; // 합을 구하는 변수
		
		while(i <= 100) { // 1~100까지 반복
			sum = sum + i ; // sum + i -> i값이 1~100까지 나오니깐 sum이랑 더함
			i++ ;
		} // while 종료
	System.out.println("총 합은 : " + sum);
	} // main 종료

} // class 종료
