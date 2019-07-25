package qyt.itheima.mapper;

import java.util.List;


import qyt.itheima.pojo.BaseDict;
public interface BaseDictDao {
	public List<BaseDict> queryBaseDict(String dict_type_code);
}
