package qyt.itheima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import qyt.itheima.pojo.BaseDict;
import qyt.itheima.pojo.Customer;
import qyt.itheima.pojo.QueryVo;
import qyt.itheima.service.BaseDictService;
import qyt.itheima.service.CutomerService;
import qyt.itheima.service.CutomerServiceImp;
import qyt.itheima.utils.Page;
@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	BaseDictService base;
	
	
	@Autowired
	CutomerService cutomerServiceImp;
	
	@RequestMapping(value="/customer/list.action")
	public String queryBaseDict(Model model,QueryVo  queryVo) {
		List<BaseDict> fromType=base.queryBaseDict("002");
		List<BaseDict> industryType=base.queryBaseDict("001");
		List<BaseDict> levelType=base.queryBaseDict("006");
		//相当于通过session啥的把数据传到前台 
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		//到点击查询就出现表单了
		Page<Customer> page=cutomerServiceImp.queryPage(queryVo);
		
		
		model.addAttribute("page", page);
		
		/*return "/WEB-INF/jsp/customer.jsp";*/
		return "customer";
	}
	
}
/**
 * select * from  dict where 002
 * 001
 * 006
 * **/
