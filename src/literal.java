
public class literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = true; // boolean은 논리변수로 true 혹은 false 2가지 리터럴을 지정할 수 있다.
		System.out.print("boolean:");
		System.out.println(bool);
		
		char character1 = 'a'; // char은 문자변수로 1개의 문자 리터럴을 지정할 수 있다.
		char character2 = 97; // 97은 아스키코드값에서 'a'값을 지닌다.
		char character3 = '\u0061'; // \u0061은 유니코드값에서 'a'를 지닌다.
		System.out.print("char:");
		System.out.print(character1);
		System.out.print(character2);
		System.out.println(character3);
		
		int constant = 59; // int는 정수변수로 작은 수의 정수 리터럴을 지정할 수 있다.(-214783648:214783647)
		System.out.print("int:");
		System.out.println(constant);

		long constantLong = 3434343L; // long은 int와 마찬가지로 정수변수이나 더 큰 수의 정수 리터럴을 지정할 수 있다.
		System.out.print("long:");
		System.out.println(constantLong);
		
		float f = 34.4f; // float은 실수변수로 작은 크기의 실수 리터럴을 지정할 수 있다.(-3.4E038 ~ 3.4E038)
		System.out.print("float:");
		System.out.println(f);
		
		double d = 3434343.4; // double 또한 실수변수로 float보다 큰 크기의 실수 리터럴을 지정할 수 있다. (-1.7E308 ~ 1.7E308)
		System.out.print("double:");
		System.out.println(d);
		
	}

}
