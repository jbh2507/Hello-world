package kr.co.programers.javastudy2;

public class LambdaExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(()-> {
			System.out.println("Lambda 표현식으로 구현한 Thread");
		}).start();
		
		// Lambda(익명메소드)는 객체를 생성하지 않고 직접 메소드를 호출하기 위한 식이다
		// (매개변수 목록)->{실행문} 형식으로 작성한다
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnalbe interface를 이용하는 객체를 생성해서 구현한 Thread");
			}
		}).start();
	}

}
