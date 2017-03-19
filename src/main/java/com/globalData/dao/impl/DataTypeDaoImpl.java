package com.globalData.dao.impl;

import java.util.List;

import com.globalData.dao.DataTypeDao;
import com.globalData.vo.DataTypeVO;

public class DataTypeDaoImpl extends BaseDaoImpl implements DataTypeDao{
	
	  
	//@Override
    public List<DataTypeVO> getDataTypes() {
    	return getSession().selectList("dataType.selectAllTypies");
    }


}
