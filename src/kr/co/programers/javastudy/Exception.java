package kr.co.programers.javastudy;

public class Exception {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
			// 수행할 코드 (예외 발생 가능성이 있는)
			int k = i/j;	// java에서는 숫자를 0으로 나눌시 Exception 발생
			System.out.println(k);
		}catch(ArithmeticException e) {
			// 예외 처리 블록, 예외가 발생하면 실행됨  (catch 뒤 괄호 안에는 '(예외클래스 변수명)' 형태로 작성)
			// 예외가 다수 발생할 것으로 예상될 시 여러개의 catch블록 사용가능
			// Exception클래스들은 모두 Exception클래스를 상속받으므로, 예외클래스에 Exception을 두게 되면 
			// 어떤 오류가 발생하든지 간에 하나의 catch블록에서 모든 오류를 처리할 수 있다.
			System.out.println("0으로 숫자를 나눌 수 없습니다."+ e.toString());	// .toString() = 예외의 정보를 알려주는 메소드
		}finally {
			//예외 발생 여부에 상관없이 반드시 실행되는 블록(생략 가능)
		}
	}
}
