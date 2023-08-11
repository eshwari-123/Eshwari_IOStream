package com.consumer;

public class Item {
	
	private int item;
	private String itemName;
	private float price;
	public Item(int item, String itemName, float price) {
		super();
		this.item = item;
		this.itemName = itemName;
		this.price = price;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
