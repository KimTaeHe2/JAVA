package ch13.genericmethod;

public class Box <T>{
	private T t;
	
	public T get() { // 게터
		return t;
	}
	
	public void set(T t) { // 세터
		this.t = t;
	}
}
