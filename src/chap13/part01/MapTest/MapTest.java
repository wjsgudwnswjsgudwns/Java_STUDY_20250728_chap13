package chap13.part01.MapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		//Map<key(클래스),value(클래스)> 객체이름 = new HashMap<,>();
		Map<String, String> map1 = new HashMap<String, String>();
		
		//map1.put(String, String)
		map1.put("이름", "홍길동"); // put -> 데이터 삽입
		map1.put("직업", "개발자"); // put -> 데이터 삽입
		map1.put("성별", "남자"); // put -> 데이터 삽입
		
		System.out.println(map1.get("이름")); // 홍길동
		System.out.println(map1.get("직업")); // 개발자
		System.out.println(map1.get("성별")); // 남자
		
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		
		map2.put("홍길동", 90);
		map2.put("이순신", 80);
		map2.put("김유신", 70);
		map2.put("강감찬", 75);
		
		map2.put("강감찬", 85); // 강감찬의 value 85로 수정
		
		
	}

}
