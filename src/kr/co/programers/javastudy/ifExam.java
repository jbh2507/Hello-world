package kr.co.programers.javastudy;

public class ifExam {

	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		
		if(i == j) {
			System.out.println("i는 j와 같습니다.");
		}else { // else 구문은 앞에 if구문 내 조건값이 false의 리터럴을 가질때 작동한다.
			System.out.println("i는 j와 같지 않습니다. 그리고");
		}
		
		if(i < j) {
			System.out.println("i는 j보다 "+(j - i)+"만큼 작습니다.");		
		}

		if(i > j) {
			System.out.println("j는 i보다 "+(i - j)+"만큼 작습니다.");
		}
		
	}
}
