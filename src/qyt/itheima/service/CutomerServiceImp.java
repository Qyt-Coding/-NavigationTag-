package qyt.itheima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qyt.itheima.mapper.CustomerDao;
import qyt.itheima.pojo.Customer;
import qyt.itheima.pojo.QueryVo;
import qyt.itheima.utils.Page;

@Service
public class CutomerServiceImp implements CutomerService {

	@Autowired
	CustomerDao customerDao;
	@Override
	public  Page queryPage(QueryVo 	vo) {
		Page<Customer>  page =new Page<Customer>();
		page.setSize(10);
		vo.setPageRows(10);
		
		if(null!= vo)
		{
			if(vo.getPage()!=null)
			{
				page.setPage(vo.getPage());
				vo.setStart((vo.getPage()-1)*vo.getPageRows());
			}
			//进行以下判断主要是想把空格去掉
			if(vo.getCustName()!=null&& !"".equals(vo.getCustName().trim()))
			{
				vo.setCustName(vo.getCustName().trim());
			}
			if(vo.getCustIndustry()!=null&& !"".equals(vo.getCustIndustry().trim()))
			{
				vo.setCustIndustry(vo.getCustIndustry().trim());
			}
			if(vo.getCustLeve()!=null&& !"".equals(vo.getCustLeve().trim()))
			{
				vo.setCustLeve(vo.getCustLeve().trim());
			}
			if(vo.getCustSource()!=null&& !"".equals(vo.getCustSource().trim()))
			{
				vo.setCustSource(vo.getCustSource().trim());
			}
			page.setRows(customerDao.queryCustomer(vo));
			
			page.setTotal(customerDao.queryCustomerRows(vo));
		}
		return page;
	}

}
/***
	private int total;
	private int page;
	private int size;	//这页有多少
    private List<T> rows;
 * ***/
