package kr.co.programers.javastudy;

public abstract class AbstractClass {
	// abstract class(추상클래스)는 상속(extends)을 통해 
	//	부모 클래스로만 이용가능하고 단독 개체로는 사용 불가능한 클래스이다. 
	
	String name;
	public AbstractClass(String name) {
		this.name = name;
	}
	
	public void name(){
		System.out.println("이름: "+this.name);
	}
	
	public abstract void abst();
}
