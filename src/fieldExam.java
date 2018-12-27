
public class fieldExam {

	public static void main(String[] args) {
		classExam c1 = new classExam("1번"); // 생성자 '1번'을 가진 인스턴스 c1 선언
		classExam c2 = new classExam("2번");	// 생성자 '2번'을 가진 인스턴스 c2 선언
		
		c1.name = "class01";
		c1.number = 001;
		
		c2.name = "class02";
		c2.number = 002;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		System.out.println(c1.str);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
		System.out.println(c2.str);

	}

}
