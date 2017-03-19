package com.globalData.vo;

import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DividentData implements BaseVo{
	
	private String companyName;
	private String stockCode;
	private Date custodianCutoffDate;
	private Date expiryDate;
	private Date assetServiceCutoffDate;
	private Date exDate;
	private Date recordDate;
	private Date payDate;
	private Date dueBillSettlementDate;
	private Date coupontDate;
	private Date transferAgentDate;
	private Date exerciseFromDate;
	private Date exerciseToDate;
	private Date custodianInstructionDate;
	private Date custodianReceiptDate;
	

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
	public Date getCustodianCutoffDate() {
		return custodianCutoffDate;
	}
	public void setCustodianCutoffDate(Date custodianCutoffDate) {
		this.custodianCutoffDate = custodianCutoffDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getAssetServiceCutoffDate() {
		return assetServiceCutoffDate;
	}
	public void setAssetServiceCutoffDate(Date assetServiceCutoffDate) {
		this.assetServiceCutoffDate = assetServiceCutoffDate;
	}
	public Date getExDate() {
		return exDate;
	}
	public void setExDate(Date exDate) {
		this.exDate = exDate;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public Date getDueBillSettlementDate() {
		return dueBillSettlementDate;
	}
	public void setDueBillSettlementDate(Date dueBillSettlementDate) {
		this.dueBillSettlementDate = dueBillSettlementDate;
	}
	public Date getCoupontDate() {
		return coupontDate;
	}
	public void setCoupontDate(Date coupontDate) {
		this.coupontDate = coupontDate;
	}
	public Date getTransferAgentDate() {
		return transferAgentDate;
	}
	public void setTransferAgentDate(Date transferAgentDate) {
		this.transferAgentDate = transferAgentDate;
	}
	public Date getExerciseFromDate() {
		return exerciseFromDate;
	}
	public void setExerciseFromDate(Date exerciseFromDate) {
		this.exerciseFromDate = exerciseFromDate;
	}
	public Date getExerciseToDate() {
		return exerciseToDate;
	}
	public void setExerciseToDate(Date exerciseToDate) {
		this.exerciseToDate = exerciseToDate;
	}
	public Date getCustodianInstructionDate() {
		return custodianInstructionDate;
	}
	public void setCustodianInstructionDate(Date custodianInstructionDate) {
		this.custodianInstructionDate = custodianInstructionDate;
	}
	public Date getCustodianReceiptDate() {
		return custodianReceiptDate;
	}
	public void setCustodianReceiptDate(Date custodianReceiptDate) {
		this.custodianReceiptDate = custodianReceiptDate;
	}
	
	public Date getInputDate() {
		return getRecordDate();
	}
	 
	public String getJasonData() {
		   ObjectMapper mapper = new ObjectMapper();
		   String jsonValue = null;
			try {
				jsonValue = mapper.writeValueAsString(this);
			} 	catch (Exception e) {
				//TODO
			}
		   return jsonValue;

	}
   public String toString() {
	   return getJasonData();
   }
}
