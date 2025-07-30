package chap13.part01;

import java.sql.Timestamp;

// DTO 클래스(VO 클래스)
// 글 한개를 저장하는 객체 -> 글 한개(글쓴이,글제목,글 내용, 글쓴 날짜)
public class Board {

	private String writer; // 글쓴이
	private String subject; // 제목
	private String contents; // 글 내용
	private Timestamp date; // 날짜
	
	
	public Board() {
		
	}
	
	public Board(String writer, String subject, String contents, Timestamp date) {
		this.writer = writer;
		this.subject = subject;
		this.contents = contents;
		this.date = date;
	}
	
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	
	
}
