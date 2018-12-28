package kr.co.programers.javastudy;

public class ExtendsExam {

	public static void main(String[] args) {
		AbstractExtendsClass ext = new AbstractExtendsClass("name");
		ext.name();	// "이름: name 해당 메소드는 extends되어 작동 중에 있습니다." Sysout
		ext.method2();
		
		AbstractClass ext2 = new AbstractExtendsClass("name2");
		// 부모의 타입으로 자식을 인스턴스 선언 할 수 있다.
//		ext2.method2(); < 컴파일 오류
		// 하지만 이렇게 선언하였을 경우 자식 클래스 내부에 선언된 메소드는 사용 할 수 없다.
		
		AbstractExtendsClass ext3 = (AbstractExtendsClass)ext2;
		// 따라서 위와 같이 클래스 형변환을 통해 자식클래스로 형 변환을 해준다.
		
		ext3.method2();
	}

}
