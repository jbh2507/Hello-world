package kr.co.programers.javastudy;

public class Exception2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
			int k = fnc(i,j);
			System.out.println(k);
		}catch(ArithmeticException e){
			System.out.println("Exception: "+ e.toString());
		}
	}
	public static int fnc(int i, int j) throws ArithmeticException{
		int k = i/j;
		return k;
	}	// throws로 인해 fnc 부분에서 Exception을 처리하는게 아니라 이 기능을 호출하는 부분에서 오류를 처리하게됨
		// 즉, throws를 사용하지 않았다면 해당 메소드 부분에도 try를 사용해야함
}
