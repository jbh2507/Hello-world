package kr.co.programers.javastudy.dataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExam {
	
	public static void main(String[] args) {
		// List data structure는 처음 끝 중간에 엘리먼트를 추가/삭제하는 기능을 지님
		int[] arry = {10, 20, 30};	// array
		ArrayList<Integer> aList = new ArrayList<>();		// ArrayList: 추가/삭제는 느림, 인덱스 조회는 빠름
		LinkedList<Integer> lList = new LinkedList<>();		// LinkedList: 추가/삭제는 빠름, 인덱스 조회는 느림
		// List는 boxed type들로만 생성 할 수 있다 (Integer, Character, Boolean etc.)
	
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		aList.add(50);
		aList.add(4,45);	// index 4에 45값 입력
		aList.remove(1);
		
		
		System.out.println("aList's size: "+aList.size());	// print: "aList's size: 2"
		System.out.println(aList);							// print: "[10, 30, 40, 45, 50]"
		
		Iterator<Integer> it = aList.iterator();			// .iterator()는 Iterator interface에서 구현하는 어떠한 객체를 return
			System.out.println("while: ");
			while(it.hasNext()) {
				int value = it.next();
				System.out.println(value);
			}
			System.out.println("forEach: ");
			for(int value : aList) {
				System.out.println(value);
			}
		
		
		
	}
}
