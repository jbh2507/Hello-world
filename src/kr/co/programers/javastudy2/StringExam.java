package kr.co.programers.javastudy2;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "world";
		
		String str3 = str1 + str2;
		System.out.println("str3: " + str3);
		// 이 위에 9행은 다음과 같이 입력되어 있지만 실제 내부에서는 다음과 같이 처리된다.
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println("str4: " + str4);
		// 따라서 String 타입의 객체에서 '+'연산자 등을 자주 이용한다면 최적화에 악영향을 주어 좋지 않은 코드가 된다.
		
		String strTest = "+";
		for(int i = 0; i < 100; i++) {
			strTest += "+";
		}
		System.out.println(strTest);
		
		// 따라서 위의 코드보다는 아래 방식의 코드가 더 좋은 코드라고 할 수 있다.
		
		StringBuffer sb = new StringBuffer().append("+");
		for(int i = 0; i < 100; i++) {
			sb.append("+");
		}
		System.out.println(sb.toString());
	}
}
