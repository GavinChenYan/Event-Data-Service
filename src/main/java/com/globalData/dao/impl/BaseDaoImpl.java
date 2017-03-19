package com.globalData.dao.impl;

import org.apache.ibatis.session.SqlSession;

public abstract class BaseDaoImpl {
	
	public SqlSession getSession() {
		return ConnectionFactory.getSession().openSession();
	}

}
