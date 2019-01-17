package kr.co.programers.javastudy2;

public class ThreadWaitNotify2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadWaitNotify1 twn = new ThreadWaitNotify1();
		twn.start();
		
		synchronized (twn) {
			try {
				System.out.println("twn thread가 완료될 때까지 대기합니다.");
				twn.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total: "+twn.total);
		}
	}

}
