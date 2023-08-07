package com.demo;

public class Disc {
int id;
String name;
String type;
float price;
	@Override
public String toString() {
	return "Disc [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
}
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
	public Disc(int id, String name, String type, float price) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.price = price;
}
	public Disc() {
		// TODO Auto-generated constructor stub
	}

}
