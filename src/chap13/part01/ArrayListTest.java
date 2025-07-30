package chap13.part01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = new ArrayList<String>();  
		// List<type parameter : 자료의 타입(클래스의 이름)> 변수 이름 = new 자식이름<생략가능>();
		
		strList.add("Kor"); // 인덱스에 Kor 들어감
		strList.add("Jap"); // 인덱스에 Jap 들어감
		
		strList.add(1, "USA"); // 인덱스 = 1 에 USA가 들어감
		
		System.out.println(strList.get(0)); // Kor이 제일 먼저 들어가서 1번
		System.out.println(strList.get(1)); // 원래 Jap이였지만 USA가 도중에 들어와서 2번
		System.out.println(strList.get(2)); // USA에게 밀려서 Jap 3번
		
		System.out.println("===============");
		
		strList.remove(1); // 인덱스 1번 삭제
		
		System.out.println(strList.get(0)); // Kor이 제일 먼저 들어가서 1번
		System.out.println(strList.get(1)); // 인덱스 1에 있던 USA가 삭제되어 Jap이 당겨짐.
	}

}
