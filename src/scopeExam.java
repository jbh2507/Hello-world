
public class scopeExam {
	int globalScope = 10;
	static int staticVal = 30;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		System.out.println(staticVal);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
		System.out.println(value2);
		System.out.println(staticVal);
		// System.out.println(localScope); = 컴파일 에러
		// System.out.println(value); = 컴파일 에러
	}
	
	public static void main(String[] args) {
		// System.out.println(globalScope); = 컴파일 에러, staticMethod 내부에서 globalScope와 같은 변수를 사용하려면 인스턴스 선언이 필요함
		// System.out.println(localScope); = 컴파일 에러
		// System.out.println(value); = 컴파일 에러
		System.out.println(staticVal);
		
		scopeExam v1 = new scopeExam(); // staticMethod 내부에서 해당 변수를 사용하기 위한 인스턴스 선언
		System.out.println(v1.globalScope);
		scopeExam v2 = new scopeExam();
		System.out.println(v2.globalScope);
		
		v1.globalScope = 1;
		v2.globalScope = 2;
		System.out.println("v1: " + v1.globalScope + " v2: " + v2.globalScope);
		
		v1.staticVal = 3;
		v2.staticVal = 4;
		System.out.println("v1: " + v1.staticVal + " v2: " + v2.staticVal);
		// static으로 선언된 필드는 2개의 인스턴스로 선언하여도 1개의 값을 공유함 따라서 둘 다 이후에 선언된 4의 리터럴을 지님
		// 이와같은 변수를 '클래스 변수'라고 함 (위의 'globalScope'와 같은 변수는 '인스턴스 변수'라고 함)
		
		// 클래스 변수는 인스턴스 선언 없이도 사용 가능하기 때문에 인스턴스 변수가 '래퍼런스.클래스변수명'의 형식으로 사용되는 것과 다르게
		// 아래와 같이 '클래스명.클래스변수명'으로 사용하는 것이 바람직하다.
		System.out.println(scopeExam.staticVal);
		
	}

}
