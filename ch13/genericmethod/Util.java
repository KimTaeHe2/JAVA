package ch13.genericmethod;

public class Util {
	// 제네릭 메서드 테스트 용
	public static <T> Box <T> boxing(T t){
		// static 은 new 없이 활용
		
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}

}
