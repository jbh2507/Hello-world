package kr.co.programers.javastudy2;

public class ThreadExam3_1 {
	public /*synchronized*/ void method3_1_1() {
		// synchronized를 넣어주면 해당 메소드가 호출 받았을때 다른 method들은 대기 중인 상태가 된다.
		
		for(int i = 0; i < 10; i++) {
			System.out.println("method1 activated...");
			
			try {
				Thread.sleep((int) (Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
		public void method3_1_2() {
			for(int i = 0; i < 10; i++) {
				
				/*synchronized (this) {System.out.println("method2 activated...");)*/
				// 24행을 위에 22행처럼 적어 method에 일부분만 synchronized 기능을 사용할 수도 있다.
					System.out.println("method2 activated...");
				
				
				try {
					Thread.sleep((int) (Math.random()*100));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			
			public void method3_1_3() {
				for(int i = 0; i < 10; i++) {
					System.out.println("method3 activated...");
					
					try {
						Thread.sleep((int) (Math.random()*100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	}
	
	
}
