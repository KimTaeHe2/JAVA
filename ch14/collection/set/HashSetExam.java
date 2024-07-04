package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// Set 인터페이스에는 HashSet, LinkedHashSet, TreeSet등 있다.
		// Set 은 중복되지 않는 인덱스가 없는 객체를 담아 놓은 구슬 주머니다.
		
		Set<String> setHashSet = new HashSet<String>();
		
		setHashSet.add("Java");
		setHashSet.add("Oracle");
		setHashSet.add("JDBC");
		setHashSet.add("HTML");
		setHashSet.add("CSS");
		setHashSet.add("JavaScript");
		setHashSet.add("JDBC");
		// HashSet은 중복 안됨
		
		int size = setHashSet.size();
		System.out.println("Set 객체수 : " + size);
		int i = 0;
		System.out.println("------인덱스가 없어서 for문으로 전체 출력 안됨------");
	
		Iterator<String> iterator = setHashSet.iterator(); // 반복자 타입에 set 타입연결
		while(iterator.hasNext()) { // hasNext() = 다음 객체가 있으면 true 없으면 false
			String element = iterator.next(); // 가져온 값을 element에 넣는다
			System.out.println(++i +"객체 : " + element);
		}
		
		setHashSet.remove("CSS");
		
		System.out.println("-----인덱스가 없어서 for each 문으로 출력 -----");
		for(String entity : setHashSet) {
			System.out.println(++i + " 객체 : " + entity);
		}
		
		
		
		
		
		
		
		
		
		
		
	} // main 종료

} // class 종료
