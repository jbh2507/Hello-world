package kr.co.programers.javastudy;

public class operator {

	public static void main(String[] args) {
		int i1 = 3;
		int i2 = 3;
		
		int i3 = i1++; // i1의 리터럴에 +1하고 그 리터럴을 i3에 대입하라
		int i4 = ++i2; // i2의 값을 i4에 대입하고 i2에 리터럴에 +1하라
		
		System.out.println(i1); // 4
		System.out.println(i2); // 4
		System.out.println(i3); // 3
		System.out.println(i4); // 4
	
		int j1 = 5;
		int j2 = 2;
		
		System.out.println(j1 + j2); // 7
		System.out.println(j1 / j2); // j2의 형이 int이기 때문에 결과 값 또한 0.5가 빠진 정수 2만 출력
		System.out.println(j1 / (double) j2); // j2의 형을 실수가 지정될 수 있는 double로 변환하면 실수 값인 2.5가 출력
		System.out.println(j1 % j2); // j1을 j2로 나눈후 나머지 값인 1이 출력
	}
}
