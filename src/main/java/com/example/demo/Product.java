package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private int id;
	private String title;
	private float price;
	private String pescription;
	private String image;
	public Product(int id, String title, float price, String pescription, String image) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.pescription = pescription;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPescription() {
		return pescription;
	}
	public void setPescription(String pescription) {
		this.pescription = pescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	
	
	

}
