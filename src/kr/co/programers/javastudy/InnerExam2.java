package kr.co.programers.javastudy;

public class InnerExam2 {
	public void method1() {
		class LocalClass{	// 지역 중첩 클래스
			int value = 0;
			public int plus(int i) {
				value = i;
				System.out.println("plus method return: " + i);
				return i;
			}
		}
		LocalClass loc = new LocalClass();
		loc.plus(1);
		}	// 'method1'메소드는 내부에 'Plus(i)' 메소드를 정의하는 'LocalClass'클래스를 가지고 있다.
			// 그리고 'method1'은 LocalClass를 loc로 인스턴스화하고 
			// 이를 통에 'LocalClass'의 'plus(i)' 메소드에 생성자 1을 넣어 작동시키는 메소드이다.
	public static void main(String[] args) {
		InnerExam2 inn = new InnerExam2();
		inn.method1();

	}

}
