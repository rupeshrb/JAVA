package com.mapping.flitered;

public class Disk {
private int dskId;
private String dskName;
private int dskPrice;
public Disk() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Disk [dskId=" + dskId + ", dskName=" + dskName + ", dskPrice=" + dskPrice + "]";
}
public int getDskId() {
	return dskId;
}
public void setDskId(int dskId) {
	this.dskId = dskId;
}
public String getDskName() {
	return dskName;
}
public void setDskName(String dskName) {
	this.dskName = dskName;
}
public int getDskPrice() {
	return dskPrice;
}
public void setDskPrice(int dskPrice) {
	this.dskPrice = dskPrice;
}
}
