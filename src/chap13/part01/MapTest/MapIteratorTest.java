package chap13.part01.MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		
		map.put("이름", "홍길동");
		map.put("직업", "개발자");
		map.put("직장", "서울자동차");
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next(); // key 추출
			map.get(key); // key 값을 이용하여 value 값 가져오기
			System.out.println(map.get(key));
		}
		
		System.out.println("-------------------");
		
		Iterator<Map.Entry<String, String>> iter2 = map.entrySet().iterator();
		// 키와 값 한 쌍에 대해서 iterator 사용
		
		while(iter2.hasNext()) {
			Map.Entry<String, String> entry = iter2.next();
			System.out.println(entry.getKey()); // key 값 가져오기
			System.out.println(entry.getValue()); // value 값 가져오기
			System.out.println(entry); // 둘 다 가져옴
		}
		
	}

}
