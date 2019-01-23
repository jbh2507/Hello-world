package kr.co.programers.javastudy2;

public class ThreadWaitNotify1 extends Thread{
		int total;
		
		public void run() {
			synchronized (this) {
				System.out.println("3");
				for(int i = 0; i <5; i++) {
					System.out.println(i+"를 더합니다.");
					total += i;
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				notify();
				System.out.println("4");
			}
		}
	
}
