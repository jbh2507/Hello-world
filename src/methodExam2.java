
public class methodExam2 {

	public static void main(String[] args) {
		methodExam mth = new methodExam();
		mth.method1();
		
		mth.method2(5);
		
		mth.method3();
		int value = mth.method3();
		System.out.println("method3 return: "+ value);
		
		mth.method4(10, 20);
		
		mth.method5(7);
		int value2 = mth.method5(3);
		System.out.println("method5 return: "+ value2);

	}

}
