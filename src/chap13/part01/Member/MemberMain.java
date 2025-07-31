package chap13.part01.Member;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.getMemberList();
		for(MemberDTO dto : list ) {
			System.out.println("아이디 : " + dto.getId() + " / 비밀번호 : " + dto.getPw() + " / 이름 : " + dto.getName() + " / 이메일 : " + dto.getEmail());
		}
	}

}
