package kr.co.programers.javastudy;

public class arrayExam3 {
	public static void main (String[] args) {
		int[][] array4 = new int[3][4];	// 정수 4개를 담을 수 있는 배열 3개를 가지는 array4 배열 선언
		
		array4[0][0] = 10;	// 첫번쨰 배열 첫번쨰 공간에 정수 10을 저장
		
		int[][] array5 = new int[3][];	// 정수 ?개를 담을 수 잇는 배열 3개를 가지는 array5를 선언
		// 이 상태에서 array5[0][0] = 10;을 실행하면 해당 저장공간이 생성되있지 않기 때문에 오류 출력
		
		array5[0] = new int[1];	// array5의 첫번째 배열에 1개의 정수를 저장할 수 있도록 선언
		// 이와 같은 방법으로 각각 길이가 다른 배열을 지니는 array를 생성 할 수 있음
	}
	
}
