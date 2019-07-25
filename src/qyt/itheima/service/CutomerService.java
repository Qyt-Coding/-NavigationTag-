package qyt.itheima.service;

import qyt.itheima.pojo.Customer;
import qyt.itheima.pojo.QueryVo;
import qyt.itheima.utils.Page;

public interface CutomerService {
	public Page<Customer> queryPage(QueryVo queryVo);
}
