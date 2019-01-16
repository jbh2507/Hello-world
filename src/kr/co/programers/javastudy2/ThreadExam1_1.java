package kr.co.programers.javastudy2;

public class ThreadExam1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExam1 t1 = new ThreadExam1("t1 Tread");
		ThreadExam1 t2 = new ThreadExam1("t2 Tread");
		
		t1.start();
		t2.start();
		// 흐름이 2개 생김
		
		
		System.out.println("main tread end...");
	}

}
