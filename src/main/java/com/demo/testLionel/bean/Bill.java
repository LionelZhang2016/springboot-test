package com.demo.testLionel.bean;

public class Bill {
	private int id;
	private double sub_total;
	private int staffId;
	private String sales_time;
	public int getId() {
		return id;
	}
	public double getSub_total() {
		return sub_total;
	}
	public void setSub_total(double sub_total) {
		this.sub_total = sub_total;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getSales_time() {
		return sales_time;
	}
	public void setSales_time(String sales_time) {
		this.sales_time = sales_time;
	}
	
}
