package kr.co.programers.javastudy;

public class AccessObj {
	public String pub = "public";	// 접근제한자 public, 모든 접근 허용
	protected String protect = "protected";	//protected, 같은 패키지 내 + 타 패키지 상속 클래스에서 접근 허용
	private String priv = "private";	// private, 자기 자신의 접근만 허용
	String defau = "default";	// 같은 패키지 내에서 접근 허용
}
