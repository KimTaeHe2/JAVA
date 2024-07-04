package ch14.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// Map 타입은 K와 V로 이루어진다.
		
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("국어", 85);
		map.put("영어", 100);
		map.put("수학", 100);
		map.put("과학", 80);
		map.put("자바", 100);
		map.put("DB", 100);
		map.put("자바", 50);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("자바 Key 값 : " + map.get("자바"));
		

	} // main 종료

} // class 종료
