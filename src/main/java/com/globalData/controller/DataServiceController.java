package com.globalData.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.globalData.dao.DataTypeDao;
import com.globalData.dao.impl.DataTypeDaoImpl;
import com.globalData.vo.DataTypeVO;

@RestController
public class DataServiceController {


    @RequestMapping("/dataTypes")
    public List<DataTypeVO> getDataTypes(@RequestParam(value="name", defaultValue="World") String name) {
    	DataTypeDao typeDao = new DataTypeDaoImpl();
        return typeDao.getDataTypes();
    }
    
    
}