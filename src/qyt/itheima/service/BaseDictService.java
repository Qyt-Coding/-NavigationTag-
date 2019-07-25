package qyt.itheima.service;

import java.util.List;

import qyt.itheima.pojo.BaseDict;

public interface BaseDictService {
	
	public List<BaseDict> queryBaseDict(String dict_type_code);
}
