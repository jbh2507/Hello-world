package kr.co.programers.javastudy2;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetExam1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();	
		// Set은 interface이기 때문에 인스턴스 선언 불가 따라서 Set을 구현은 HashSet을 통해 인스턴스 선언
		boolean flag1 = set1.add("kang");	
		// .add();는 String 값을 받고 해당 데이터가 이미 있는 경우는 false 없으면 ture를 반환한다.
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");
		
		System.out.println(set1.size());
		System.out.println(flag2);
		System.out.println(flag3);
		
//		Set에서 자료를 하나하나 꺼내보기 위해서는 Set의 부모 클래스인 Collection이 가지고있는 interface iterator를 이용해야함
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {	// .hasNext(); 데이터가 있는 동안 true를 반환
			String str = iter.next();
			System.out.println(str);
		}
	}
}
