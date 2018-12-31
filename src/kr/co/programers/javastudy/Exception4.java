package kr.co.programers.javastudy;

public class Exception4 {
	public void ExcMethod(int i) throws NewException{
		System.out.println("ExcMethod start");
		if(i < 0) {
			throw new NewException("매개변수 i는 0보다 작습니다.");
		}
		System.out.println("ExcMethod end");
	}
}
