package kr.co.programers.javastudy;

public class methodExam {
	// public '리턴타입' '메소드명' (매개변수){구현} 방식으로 메소드 선언
	public void method1 () {
		System.out.println("method1 activated...");
	}	// 들어오는 티런타입 X 파라미터 X
	
	public void method2 (int i) {
		System.out.println("parameter in: "+i+" method2 activated... ");
	}
	
	public int method3 () {
		System.out.println("method3 activated...");
		return 10;
	}
	
	public void method4 (int i, int j) {
		System.out.println("parameter in: " + i + ", " + j +" method4 activated...");
	}
	
	public int method5 (int i) {
		System.out.println("paramether in: "+ i + " method5 activated...");
		return i*2;
	}
}
