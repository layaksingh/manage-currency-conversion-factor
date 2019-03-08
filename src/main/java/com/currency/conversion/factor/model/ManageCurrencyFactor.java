package com.currency.conversion.factor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

 @Entity
public class ManageCurrencyFactor {
 
	 @Id 
 private int id;
	 @Column(name="currency_from")
 private String from;
	 @Column(name="currency_to")
 private String to;
	 @Column(name="conversion_factor")
 private double factor;
	 
	 
	 public ManageCurrencyFactor(){
		 
	 }
	public ManageCurrencyFactor(int id, String from, String to, double factor) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.factor = factor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getFactor() {
		return factor;
	}
	public void setFactor(double factor) {
		this.factor = factor;
	}
	@Override
	public String toString() {
		return "ManageCurrencyFactor [id=" + id + ", from=" + from + ", to=" + to + ", factor=" + factor + "]";
	}
 



 




}
