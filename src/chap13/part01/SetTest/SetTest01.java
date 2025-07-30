package chap13.part01.SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set1 = new HashSet<String>();
		
		set1.add("Kor");
		set1.add("Jap");
		set1.add("Ger");
		set1.add("USA");
		
		System.out.println(set1.size()); // set1에 들어간 객체 수 -> 4
		
		set1.add("Jap");
		set1.add("Ger");
		set1.add("Rus");
		
		System.out.println(set1.size()); // set1에 들어간 객체 수 -> 5
		
		Iterator<String> iter = set1.iterator(); 
		// 저장된 객체를 한번씩 가져오는 반복자를 리턴합니다.
		// 쉽게 말해 객체 하나씩 꺼냄
		while(iter.hasNext()) { // String 객체 하나를 가져옴. 다 꺼내면 false 출력함. 
			String str = iter.next(); // set 요소(객체)를 꺼내고 iterator 이동
			if (str.equals("Jap")) {
				iter.remove();
			}
			System.out.println(str);
		}
		
		System.out.println("-------");
		
		for(String str : set1) {
			System.out.println(str);
		}
		
		System.out.println("-------");
		
		set1.clear(); // 모든 객체 삭제
		
		if (set1.isEmpty()) { // true -> 이 set1 안에는 아무런 객체가 없음.
			System.out.println("비어 있음");
		} else {
			System.out.println("비어 있지않음");
		}
	}
}
