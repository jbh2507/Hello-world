package kr.co.programers.javastudy;

public class InnerExam {
	class InstanceClass{	// instance class(중첩 클래스) - 필드를 선언한는 위치에 선언되는 클래스
		String field;
		int value = 0;
		public int plus(int i) {
			value = i;
			System.out.println("plus method return: " + i);
			return i;
		}
	}
	
	static class StaticClass{	// static class(정적 중첩 클래스)
		String field;
		int value = 0;
		public int plus(int i) {
			value = i;
			System.out.println("plus method return: " + i);
			return i;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerExam inn = new InnerExam();
		InnerExam.InstanceClass ins = inn.new InstanceClass();
		ins.plus(1);
		
		InnerExam.StaticClass sta = new InnerExam.StaticClass();
		sta.plus(2);
		
	}
}
