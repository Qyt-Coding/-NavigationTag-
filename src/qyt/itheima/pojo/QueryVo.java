package qyt.itheima.pojo;

public class QueryVo {

	String custName;
	String custSource;
	String custIndustry;
	String custLeve;
	//当前页	默认给1
	Integer page=1;
	
	//每页显示的个数
	Integer  pageRows=10;
	
	Integer start;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustSource() {
		return custSource;
	}

	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}

	public String getCustIndustry() {
		return custIndustry;
	}

	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}

	public String getCustLeve() {
		return custLeve;
	}

	public void setCustLeve(String custLeve) {
		this.custLeve = custLeve;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageRows() {
		return pageRows;
	}

	public void setPageRows(Integer pageRows) {
		this.pageRows = pageRows;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}
	
	
}
