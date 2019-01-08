package kr.co.programers.javastudy2;

import java.util.ArrayList;
import java.util.List;

public class ListExam1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// List 또한 interface이기 때문에 List를 구현하고 있는 ArrayList를 통해 인스턴스 선언
		list.add("hello");
		list.add("world");
		list.add("hello");
		
		System.out.println(list.size());	// Sysout: 3, List는 중복된 값도 받는 자료구조이다.
		
		for(int i = 0; i < list.size(); i++) {
			String str =list.get(i);	// List는 .get(index);를 통해 값을 가져온다
			System.out.println(str);
		}
		
		// 위 for 구문과 아래 forEach구문은 같은 결과를 출력
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}
