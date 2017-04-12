package com.globalData.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.globalData.dao.DataTypeDao;
import com.globalData.util.GenerateShortUUID;
import com.globalData.util.JSonMapper;
import com.globalData.vo.DataTypeVO;
import com.globalData.vo.DividentData;

public class DataTypeDaoImplTest {	
	@Ignore
	@Test
    public void testGetAllType() throws Exception {
		DataTypeDao typeDao = new DataTypeDaoImpl();
		List<DataTypeVO> result = typeDao.getDataTypes();
		Assert.assertTrue(result.size()>0);
    }

	@Test
    public void testUUID() throws Exception {
		System.out.println(GenerateShortUUID.next());
	}

	@Test
    public void testJsonValue() throws Exception {
		
		DividentData data = new DividentData();
		data.setCompanyName("IBM");
		data.setStockCode("IBM");
		data.setAssetServiceCutoffDate(new Date());
		data.setCoupontDate(new Date());
		System.out.println(JSonMapper.toJson(data));
	}

}
