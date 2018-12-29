package kr.co.programers.javastudy;

public interface HiInterface {
	public int MIN_I = 0;
	public int MAX_I = 100;
	
	public void fnc1();
	public void fnc2();
	public void fnc3(int i);
	
	default void fnc4() {
		System.out.println("default method activated in interface...");
	}	// interface 내에서 메소드 작동까지 정의하고 싶다면 default로 선언
	
	public static void fnc5() {
		System.out.println("static method activated in interface...");
	}
}
