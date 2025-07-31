package chap13.part01.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	public List<MemberDTO> getMemberList() {
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("tiger", "12345", "홍길동", "tiger@abc.com"));
		list.add(new MemberDTO("lion", "54321", "이순신", "lion@abc.com"));
		list.add(new MemberDTO("blackcat", "88888", "김유신", "blackcat@abc.com"));
		list.add(new MemberDTO("whitedog", "99999", "강감찬", "whitedog@abc.com"));
		
		return list;
		
	}
}
