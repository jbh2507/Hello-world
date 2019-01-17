package kr.co.programers.javastudy2;

public class ThreadJoinExam1 {
	
	public static void main(String[] args) {
		ThreadExam1 thr = new ThreadExam1("hello");
		
		thr.start();
		
		System.out.println("main is start!");
		
		try {
			thr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main is end...");
	}
	
}
