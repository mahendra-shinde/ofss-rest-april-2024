package com.mahendra;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Loan {
	private String loanId;
	private String customer;
	private double disbursedAmount;
	private double emi;
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public double getDisbursedAmount() {
		return disbursedAmount;
	}
	public void setDisbursedAmount(double disbursedAmount) {
		this.disbursedAmount = disbursedAmount;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	
	public Loan() {
	}
	public Loan(String loanId, String customer, double disbursedAmount, double emi) {
		super();
		this.loanId = loanId;
		this.customer = customer;
		this.disbursedAmount = disbursedAmount;
		this.emi = emi;
	}
	

}
