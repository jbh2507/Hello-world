package kr.co.programers.javastudy;

public class InterfaceExam implements HiInterface {

	@Override
	public void fnc1() {
		// TODO Auto-generated method stub
		System.out.println("fnc1 activated...");
	}

	@Override
	public void fnc2() {
		// TODO Auto-generated method stub
		System.out.println("fnc2 activated...");
	}

	@Override
	public void fnc3(int i) {
		// TODO Auto-generated method stub
		System.out.println("fnc3 activated... set "+ i);
	}
	
	// fnc4는 이미 default로 정의 되어있으므로 따로 정의 안해도 작동함
	// fnc5는 static으로 정의 되어 있기 때문에 클래스로 호출 불가
}
