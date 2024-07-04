package ch14.collection.list;

public class BoardDTO {

	// 필드
	private String subject; // 제목
	private String content; // 내용
	private String writer;  // 작성자
	

	// 생성자 -> 기본생성자(세터활용)
	public BoardDTO() {};
	public BoardDTO(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	// 메서드
	
	public String getSubject() {
		return subject;
	}


	public String getContent() {
		return content;
	}


	public String getWriter() {
		return writer;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [subject=" + subject + ", content=" + content + ", writer=" + writer + ", getSubject()="
				+ getSubject() + ", getContent()=" + getContent() + ", getWriter()=" + getWriter() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
} // class 종료
