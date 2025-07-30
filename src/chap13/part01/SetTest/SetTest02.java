package chap13.part01.SetTest;

import java.util.HashSet;
import java.util.Set;

public class SetTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<MemberDto> set = new HashSet<MemberDto>();
		
		MemberDto member1 = new MemberDto("tiger", "12345", "홍길동", 27);
		set.add(member1);
		set.add(member1);
		set.add(member1);
		set.add(member1);
		
		System.out.println(set.size()); // 4번을 입력 했지만 중복 허용 하지 않아 크기는 1
	}

}
