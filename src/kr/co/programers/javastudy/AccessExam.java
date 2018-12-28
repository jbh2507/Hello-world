package kr.co.programers.javastudy;

public class AccessExam {

	public static void main(String[] args) {
		AccessObj acc = new AccessObj();
		
		System.out.println(acc.pub);
		System.out.println(acc.protect);
//		System.out.println(acc.priv); > 접근 권한 없어서 오류 출력
		System.out.println(acc.defau);
	}

}
