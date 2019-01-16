package kr.co.programers.javastudy2;
// Thread 만드는 첫번쨰 방법 : SuperClass로 java.lang의 Thread 클래스를 extends한다
public class ThreadExam1 extends Thread {
	String str;
	
	public ThreadExam1(String str) {
		this.str = str;
	}

	@Override	// run을 Override, run method는 수행흐림이 더 추가됬을때 사용하는 method
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			
			try {	// .sleep(milli sec)는 Exception을 발생 시키기 때문에 try로 묶어줘야댐
				Thread.sleep((int) (Math.random()*1000)); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		super.run();
	}

}
