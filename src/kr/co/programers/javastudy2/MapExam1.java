package kr.co.programers.javastudy2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();	// Map<key, Value>
		map.put("001", "hello");	// Map 자료구조는 .put(key, value);를 통해 데이터를 입력한다
		map.put("002", "world");
		
		map.put("001", "hi");
		System.out.println(map.size());
		// Sysout: 2, map은 같은 값은 받지 않는다. 따라서 13행의 입력 받아 11행에서 해당 키에 입력해두었던 데이터를 덮어씌운다.
		System.out.println(map.get("001"));	// .get(key); map의 Key값 "001"에 저장된 Value를 불러온다
		
		Set<String> keys = map.keySet();	// .keySet(); 해당 자료구조 내에 모든 키값을 가져온다.
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println("map's key: "+key+" Value: "+value);
		}
		}
}
