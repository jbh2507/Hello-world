package kr.co.programers.javastudy2;
// Thread를 구현하는 방법 두번째: Runnable interface를 implements한다
public class ThreadExam2 implements Runnable {
	
	String str;
	public ThreadExam2(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
		}
		try {
			Thread.sleep((int)(Math.random()*1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
