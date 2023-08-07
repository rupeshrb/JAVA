package com.mapping.collection.set;

import java.util.Set;

public class Book {
private int bid;
private String bk_tittle;
private String bk_publisher;
private Set<String> authors;

@Override
public String toString() {
	return "Book [bid=" + bid + ", bk_tittle=" + bk_tittle + ", bk_publisher=" + bk_publisher + ", authors=" + authors
			+ "]";
}

	public int getBid() {
	return bid;
}

public void setBid(int bid) {
	this.bid = bid;
}

public String getBk_tittle() {
	return bk_tittle;
}

public void setBk_tittle(String bk_tittle) {
	this.bk_tittle = bk_tittle;
}

public String getBk_publisher() {
	return bk_publisher;
}

public void setBk_publisher(String bk_publisher) {
	this.bk_publisher = bk_publisher;
}

public Set<String> getAuthors() {
	return authors;
}

public void setAuthors(Set<String> authors) {
	this.authors = authors;
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}


}
