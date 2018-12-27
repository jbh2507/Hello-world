package kr.co.programers.javastudy;

public class operator2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		int k = 5;
		
		System.out.println(i == j); // i = j boolean 값 출력
		System.out.println(i <= j); // i ≤ j boolean 값 출력
		System.out.println(i != j); // i = j boolean 값 반대로 출력
		System.out.println(i == j && i == k ); // && = and, 비교 연산자 '=='보다 논리 연산자 &&이 우선도가 높기 때문에 먼저 실행
		System.out.println(i == j || i == k); // || = or, 우선도 위 주석과 동일
		
		int a = 5;
		int b = 5;
		
		System.out.println(++a - 5); // 선행 증감 연산자는 산술 연산자보다 우선도가 높기 때문에 계산 시 a == 6이 되고 6 - 5 = 1이 출력 됨
		System.out.println(b++ -5); // 후행 증감 연산자는 산술 연산자보다 우선도가 낮기 때문에  위와 달리 계신시 b == 5가 되고 5 - 5 = 0이 출력 됨
		System.out.println(a); 
		System.out.println(b); // 우선도가 낮은 것이지 작동하지 않는게 아니기 때문에 작동 이후에 a와 b 변수 리터럴을 출력해보면 둘 다 6이 나옴
		
		i += 10; // i = i + 10;
		
		System.out.println(i);
		
		System.out.println(i -= 10);
		System.out.println(i);
	}

}
