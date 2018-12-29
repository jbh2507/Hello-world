package kr.co.programers.javastudy;

public class InterfaceExam2 {
	
	public static void main(String[] args) {
		HiInterface inf = new InterfaceExam();
		
		inf.fnc1();
		inf.fnc2();
		inf.fnc3(3);
		inf.fnc4();
//		inf.fnc5(); < 컴파일 오류
		HiInterface.fnc5(); // static method는 인터페이스명으로 호출해야 작동함ㅁ
	}
}
