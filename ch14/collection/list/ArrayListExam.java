package ch14.collection.list;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExam {

	public static void main(String[] args) {
		// list 컬렉션은 ArrayList, vector, LinkedList 3가지를 주로 사용한다
		// list 컬렉션은 배열 대신 활용도가 높다. (길이가 자유롭다)
		// list<String> 는 강한타입체크로 String 만 들어감
		// List<String> list = new ArrayList<String>(); -> 10개가 기본값
		
		List<String> listS = new ArrayList<String>();
		listS.add("JAVA"); 			// 0 인덱스
		listS.add("Oracle"); 		// 데이터베이스
		listS.add("JDBC");			// 자바 + DB연동
		listS.add("HTML, CSS, JS"); // 프론트
		listS.add("JSP");			// 자바 + db + 프론트
		listS.add("tomcat");		// 서버 프로그램(servlet)
		listS.add("리눅스");			// 베포 서버
		listS.add(5, "servlet");	// jsp + JAVA
		listS.add("AWS");			// 가상 베포 서버
		
		int size = listS.size();
		System.out.println("총 객체수 : " + size);
		System.out.println("==========================");
		String skill = listS.get(2); // 2번 인덱스 값을 가져와 skill 변수에 넣다.
		System.out.println("2번째 인덱스 값 : " + skill);
		
		listS.remove(2);
		listS.remove(2);
		listS.remove("JSP");
		System.out.println("==========전체출력==========");
		
		for(int i = 0; i < listS.size(); i++) {
			System.out.println((i+1) + " 번째 값 : " + listS.get(i));
		}
		
		System.out.println("======for each 전체 출력====="); // index 사용안함
		for(String str : listS) {
			System.out.println(str);
		}
		
		
		
	} // main 종료

} // class 종료
