package qyt.itheima.mapper;

import java.util.List;


import qyt.itheima.pojo.BaseDict;
import qyt.itheima.pojo.Customer;
import qyt.itheima.pojo.QueryVo;
import qyt.itheima.utils.Page;
public interface CustomerDao {
	public List<Customer> queryCustomer(QueryVo vo);
	public Integer queryCustomerRows(QueryVo vo);
}
