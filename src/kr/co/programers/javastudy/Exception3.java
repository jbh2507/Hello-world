package kr.co.programers.javastudy;

public class Exception3 {
	// Exception2에서 와는 다르게 fnc(j)가 0으로 들어가는거 자체가 문제가 된다고 생각될때 다음과 같이 조치할수도 있다.
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try{
			int k = fnc(i,j);
			System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		
	}
	public static int fnc(int i, int j) throws ArithmeticException{
		if(j == 0) {
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
			// j에 0 값이 들어올 경우 IllegalArgumentException을 발생시킴
		}
		int k = i/j;
		return k;
	}
}
