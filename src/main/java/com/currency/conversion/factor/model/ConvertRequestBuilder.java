package com.currency.conversion.factor.model;

public class ConvertRequestBuilder {
	
	private String currency;
	private double amount;
	private int id;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ConvertRequestBuilder [currency=" + currency + ", amount=" + amount + "]";
	}
	

}
