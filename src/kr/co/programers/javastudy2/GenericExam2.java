package kr.co.programers.javastudy2;

public class GenericExam2 {

	public static void main(String[] args) {
//		GenericExam1 box = new GenericExam1();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		System.out.println((String)box.getObj()); 
//		위의 예문들은 Generic 기능을 사용하지 않았을 때의 기능 구현 예임
//		10행과 11행을 보면 Object타입이라 자식 클래스인 String을 받아들이긴 하지만
//		11행에서처럼 불러오지는 못하여 불러올떄마다 형변환을 해줘야 함을 알 수 있음
		
		GenericExam1<String> box = new GenericExam1<>();	// GenericExam1에서 E를 String 클래스로 사용하는 인스턴스 box를 선언
		box.setObj("hello");
		System.out.println(box.getObj());	// 위의 Genric을 사용하지 않은 예와 다르게 형 변환 없이 사용 가능
		
//		위의 Generic기능은 Collection framework의 interface에서 많이 사용됨
	}
}
