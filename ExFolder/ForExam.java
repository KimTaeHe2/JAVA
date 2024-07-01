package ExFolder;

public class ForExam {

	public static void main(String[] args) {
		// For 구구단 만들기 연습
		
		System.out.println("======구구단 외우기======");
		for(int f = 2 ; f <=9 ; f++) {
			System.out.println(" === " + f + " 단 ===");
			for(int b = 1 ; b <=9 ; b++) {
				System.out.println(f +" X "+ b + " = " + (f*b));
			}
		}

	}

}
