package kr.co.programers.javastudy2;

public class ThreadExam2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExam2 t1 = new ThreadExam2("Thread 1");
		ThreadExam2 t2 = new ThreadExam2("Thread 2");
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		// Runnalble interface를 이용해서 thread를 구현하는 경우에는
		// Runnalble은 .start() method를 가지고 있지 않기 때문에 
		// runnable을 생성자로 받는 Thread 객체를 따로 인스턴스해주어야 한다.
		
		thread1.start();
		thread2.start();
	}

}
