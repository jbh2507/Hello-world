package kr.co.programers.javastudy2;

public class StringBufferExam {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");	// sb2에 "hello"를 붙여 sb2로 선언
		if(sb2 == sb3) {
			System.out.println("sb2 == sb3");
		}
		// StringBuffer은 메소드를 통해 수정할 경우 String과는 다르게 레퍼런스 자체가 변조된다.
		// 따라서 15행에 sb3를 선언하며 .append(); 메소드를 사용하며 sb2 또한 값이 변조되어 sb2 == sb3가 true를 반환하는 것이다.
		
		String str2 = new StringBuffer().append("hello ").append("world").toString();
		// StringBuffer가 기본적으로 가지고있는 메소드들은 대부분 자기 자신(this)를 반환함
		// 따라서 자기자신을 리턴하여 계속 자신의 메소드를 호출하여 사용하는 메소드 체이닝(Method Chaining)을 사용할 수 있음(위의 예처럼)
		System.out.println(str2);	// sysout: hello world 
	}
}
