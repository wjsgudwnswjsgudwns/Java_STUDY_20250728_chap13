package chap13.part01;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Board> boardList = new ArrayList<Board>();
		
		Date nowDate = new Date();
		
		
		Board board1 = new Board();
		board1.setWriter("홍길동");
		board1.setSubject("안녕하세요");
		board1.setContents("가입인사 드립니다.");
		board1.setDate(new Timestamp(nowDate.getTime()));
		
		boardList.add(board1); // 보드 리스트에 저장
		
		boardList.add(new Board("이순신", "저는 이순신입니다", "저는 조선의 해군 장군입니다", new Timestamp(nowDate.getTime())));
		// 보드 리스트에 저장
		
		Board board2 = new Board("김유신", "저는 김유신입니다", "저는 신라의 장군입니다", new Timestamp(nowDate.getTime()));
		boardList.add(board2); // 보드 리스트에 저장
		
		System.out.println("제 목 / 글 내 용 / 글 쓴 이 / 글 쓴 날 짜");
		System.out.println("----------------------------------------------------------------------");
		for (int i=0;i<boardList.size();i++) { // arraylist는 length가 아니라 size
			Board board = boardList.get(i); // 저장할 임시 객체
			System.out.println(board.getSubject() + " / " + board.getContents() + " / " + board.getWriter() + " / " + board.getDate());
		}
	}

}
