package qyt.itheima.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qyt.itheima.mapper.BaseDictDao;
import qyt.itheima.pojo.BaseDict;
@Service
public class BaseDictServiceImp implements BaseDictService{

	@Autowired
	BaseDictDao base;
	@Override
	public List<BaseDict> queryBaseDict(String dict_type_code) {
		return base.queryBaseDict(dict_type_code);
	}
}

	
