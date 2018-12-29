package kr.co.programers.javastudy;

public class InnerExam5 {
	public static void main(String[] args) {
//		InnerExam3 inn4 = new InnerExam4();
//		inn4.fnc(); < Sysout(extneds method activated...)
		
		InnerExam3 inn3 = new InnerExam3() {
			@Override
			public void fnc() {
				System.out.println("Override extends method activated...");
			}
		}; 
		// InnerExam3 클래스를 상속받는 이름 없는 개체를 만든다는 것을 의미 (5,6행 주석에 사용된 'InnerExam4'와 같은 기능을 하는)
		// 그리고 이 개체를 익명 클래스라고 함
		inn3.fnc(); // < Sysout(Override extends method activated...)
	}
}
