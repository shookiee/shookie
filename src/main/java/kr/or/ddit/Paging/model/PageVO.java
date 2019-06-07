package kr.or.ddit.Paging.model;

public class PageVO {
	
    private int page;	// 페이지 번호
	private int pageSize;	// 페이지 당 건수
	
	
	public PageVO() {

	}


	public PageVO(int page, int pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}


	@Override
	public String toString() {
		return "PageVO [page=" + page + ", pageSize=" + pageSize + "]";
	}


	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	
}
