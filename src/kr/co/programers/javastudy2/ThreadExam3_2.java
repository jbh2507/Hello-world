package kr.co.programers.javastudy2;

public class ThreadExam3_2 extends Thread{
	int type;
	ThreadExam3_1 thr31;
	
	public ThreadExam3_2(int type, ThreadExam3_1 thr31) {
		this.type = type;
		this.thr31 = thr31;
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1:
			thr31.method3_1_1();
			break;
		case 2:
			thr31.method3_1_2();
			break;
		case 3:
			thr31.method3_1_3();
			break;
		default:
			System.out.println("error: 'type' can input arrange by 1-3");
			break;
		}
		super.run();
	}

}
