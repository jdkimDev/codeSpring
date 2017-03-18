package org.zerock.domain;

import java.sql.Date;

public class BoardVO {
	// int(�ڷ���) - Integer(��ü)
	// ������갡��, null�ʱ�ȭ ����. - 
	//            int�� ����ȯ�� ������갡��, nulló���� �����ϰ� sql�� ������ ó���� ����, DB�ڷ����� �������� null���� �ʿ��Ѱ�� Interger���
	// bno ���� pk�� �ٵ�? null �� �ʿ� ������ ������... ���� Integer�� ������ ������? 
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
