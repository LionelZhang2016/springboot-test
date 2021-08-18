package com.demo.testLionel.bean;

public class BillDetails {
	private int id;
	private int bill_id;
	private int menu_id;
	private int extra_ids;
	private String extra_names;
	private int qty;
	private double sub_total;
	private String dish_name;
	private double extra_price;
	private double dish_price;
	public int getId() {
		return id;
	}
	public int getBill_id() {
		return bill_id;
	}
	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public int getExtra_ids() {
		return extra_ids;
	}
	public void setExtra_ids(int extra_ids) {
		this.extra_ids = extra_ids;
	}
	public String getExtra_names() {
		return extra_names;
	}
	public void setExtra_names(String extra_names) {
		this.extra_names = extra_names;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getSub_total() {
		return sub_total;
	}
	public void setSub_total(double sub_total) {
		this.sub_total = sub_total;
	}
	public String getDish_name() {
		return dish_name;
	}
	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}
	public double getExtra_price() {
		return extra_price;
	}
	public void setExtra_price(double extra_price) {
		this.extra_price = extra_price;
	}
	public double getDish_price() {
		return dish_price;
	}
	public void setDish_price(double dish_price) {
		this.dish_price = dish_price;
	}
	
	
	

}
