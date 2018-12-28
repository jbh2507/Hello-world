package kr.co.programers.javastudy;

public class AbstractExtendsClass extends AbstractClass {
	public AbstractExtendsClass(String name) {
		super(name);
		// super(); = 부모클래스의 생성자 호출, 기본 생성자인 경우 안써줘도 알아서 작동
		// but 기본 생성자가 아닌경우 직접 호출해줘야함
		// 위와 같이 작성 시에는 타 클래스에서 AbstractExtendsClass를 인스턴스 선언할때 입력한 생성자가
		// AbstractClass의 생성자로서도 기능하게됨
	}
	
	public void name(){
		super.name();
		System.out.println("해당 메소드는 extends되어 작동 중에 있습니다.");
	}
	// 부모 클래스의 메소드를 동일한 이름으로 선언하여 'OverRide(덮어쓰기)'할 수 있다.
	// 위 처럼 ovrride한 메소드 내부에 'super.name'과 같이 해당 부모메소드를 불러와주면
	// 부모 메소드 실행 후 ovrride한 내용을 실행하도록 할 수 있다.
	
	public void method2() {
		System.out.println("method2 activated...");
	}
	
	@Override
	public void abst() {
		// TODO Auto-generated method stub
		
	}
}
