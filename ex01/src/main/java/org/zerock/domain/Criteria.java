package org.zerock.domain;

//Criteria 사전적의미 : 검색기준, 분류기준 
public class Criteria {
	private int page;
	private int perPageNum;
	
	public Criteria(){
		this.page=1;
		this.perPageNum=10;
	}
	
	public void setPage(int page){
		if(page<=0){
			this.page=1;
			return;
		}
		
		this.page = page;
	}
	
	public void setPerPageNum(int perPageNum){
		if(perPageNum<=0 || perPageNum>100){
			this.perPageNum=10;
			return;
		}
		
		this.perPageNum = perPageNum;
	}
	
	public int getPage(){
		return page;
	}
	
	//method for MyBatis SQL Mapper
	//XML Mapper 에서 사용하는 getter를 제공
	public int getPageStart(){
		//시작데이터번호 = (페이지번호-1) * 페이지당보여지는개수
		return (this.page-1)*perPageNum;
		
	}
	
	//method for MyBatis SQL Mapper
	public int getPerPageNum(){
		return this.perPageNum;
	}
	
	@Override
	public String toString(){
		return "Criteria [page="+page+", "+"perPageNum="+perPageNum+"]";
	}
	
	
}
