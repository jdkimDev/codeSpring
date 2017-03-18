package org.zerock.domain;

import java.sql.Date;

public class BoardVO {
	// int(자료형) - Integer(객체)
	// 산술연산가능, null초기화 못함. - 
	//            int로 형변환시 산술연산가능, null처리가 가능하고 sql과 연동시 처리가 용이, DB자료형이 정수지만 null값이 필요한경우 Interger사용
	// bno 값은 pk일 텐데? null 이 필요 없을거 같은데... 굳이 Integer로 선언한 이유가? 
	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", viewcnt=" + viewcnt + "]";
	}
	
	
}
