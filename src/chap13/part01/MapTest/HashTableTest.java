package chap13.part01.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("tiger", "12345"); // id, pw
		map.put("lion", "88888"); // id, pw
		map.put("blackcat", "99999"); // id, pw
		map.put("whitedog", "77777"); // id, pw
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호 : ");
			String pw = scanner.nextLine();
			
			System.out.println("------------");
			
			if(map.containsKey(id)) { // 맵에 들어 있는 데이터의 key 값들 중에 id 값과 일치하는 값이 존재하면 true 발생
				if(map.get(id).equals(pw)) { // map.get(id) -> value 가 pw 와 같은지 비교 
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("잘못된 비밀번호 입니다");
				}
			} else {
				System.out.println("존재하지 않는 아이디입니다");
			}
		}
	}

}
