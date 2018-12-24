
public class stringExam {

	public static void main(String[] args) {
		String str1 = "hello";	// String 참조 변수는 new없이도 선언 할 수 있다.
		String str2 = "hello";	// 단, new없이 선언할시에 상수 메모리 영역에 저장되며 상수영역 내에 같은 값을 저장하고 있는
								// 참조변수가 있을 시 그 데이터를 가져온다. 즉 여기서 str1과 str2는 같은 부분의 데이터를 공유한다.

		String str3 = new String("hello");	// 반대로 new를 사용해서 선언할 시 다른 데이터 영역을 지닌다.
		String str4 = new String("hello");	// 따라서 str3와 str4는 다른 데이터 영역(레퍼런스)를 지닌다.
		
		if(str1 == str2)
			System.out.println("str1과 str2는 같은 레퍼런스 입니다.");
		// 레퍼런스가 아니라 문자열 자체를 비교하고 싶을 때는
		// str1.equals(str2)를 사용한다. 같은 문자열이라면 true 반환
		// "hello".equals(str1) 형태는 가능 str1.equals("hello")는 불가능
		// 후자는 str1이 null값을 지닐때 Exception 발생의 소지가 있음
		
		if(str3 == str4)
			System.out.println("str3와 str4는 같은 레퍼런스입니다.");
		
		System.out.println(str1.substring(3)); // substring 메소드: (x)번째부터 짤라서 출력
		
		System.out.println(str1);	// String 내부 값은 메소드의 영향을 주지 않는다. (정확히는 메소드 작동 후 새로운 String을 만들어 반환하기 때문에 원래 값으로 돌아온다)
	}

}
