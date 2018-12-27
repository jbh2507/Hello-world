package kr.co.programers.javastudy;

public class forEachExam {

	public static void main(String[] args) {
		int[] iArr = {1,2,3,4};
		
		for(int i = 0; i < iArr.length; i++) {
			int value = iArr[i];
			System.out.println(value);
		}
		
		//위 구문(for구문)과 아래(forEach구문) 구문은 같은 결과를 출력함
		
		for(int value:iArr) {
			System.out.println(value);
		}

	}

}
