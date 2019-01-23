package kr.co.programers.javastudy2;
// LambdaExam

public class CompareExam {
	public static void exec(Compare compare) {
		int k = 10;
		int m = 20;
		int value = compare.compareTo(k, m);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exec((i,j)-> {
			return i - j;
		});
		// 이와같이 입력하였을 때 Lambda는 exec에서 int값 2개를 매개변수로 받는 method를 탐색하고 그것을 사용한다.
	}

}
