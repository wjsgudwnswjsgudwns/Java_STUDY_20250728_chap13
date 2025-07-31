package chap13.part01.Ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Iterator<String> iter = map.keySet().iterator();
		
		while (iter.hasNext()) {
			String key = iter.next();
			map.get(key);
			
			if (map.get(key) > maxScore) { // 최고 점수
				maxScore = map.get(key);
				name = key;
			}	
			totalScore += map.get(key); // 총합
		}
		
		int avg = totalScore / map.size(); //평균
		
		System.out.println("평균 점수 : " + avg);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
	}	

}
