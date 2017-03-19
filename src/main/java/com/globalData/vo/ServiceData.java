package com.globalData.vo;

import java.util.Date;

public class ServiceData {

	private String dataType;
	private String companyName;
	private String stockCode;
	private String refId;
	private String jasonData;
	private Date inputDate;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getRefId() {
		return refId;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public String getJasonData() {
		return jasonData;
	}
	public void setJasonData(String jasonData) {
		this.jasonData = jasonData;
	}
	
	
}
