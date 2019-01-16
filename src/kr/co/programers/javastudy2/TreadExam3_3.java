package kr.co.programers.javastudy2;

public class TreadExam3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExam3_1 thr31 = new ThreadExam3_1();
		
		ThreadExam3_2 thr321 = new ThreadExam3_2(1, thr31);
		ThreadExam3_2 thr322 = new ThreadExam3_2(2, thr31);
		ThreadExam3_2 thr323 = new ThreadExam3_2(3, thr31);
		
		thr321.start();
		thr322.start();
		thr323.start();
	}

}
