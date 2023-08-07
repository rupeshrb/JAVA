package com.bank.signin;

public class CutomerData {
private String cust_Id;
private String cust_Name;
private String cust_phone;
private String cust_balace;

public CutomerData(String cust_Id, String cust_Name, String cust_phone, String cust_balace) {
	super();
	this.cust_Id = cust_Id;
	this.cust_Name = cust_Name;
	this.cust_phone = cust_phone;
	this.cust_balace = cust_balace;
}
public CutomerData() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "CutomerData [cust_Id=" + cust_Id + ", cust_Name=" + cust_Name + ", cust_phone=" + cust_phone
			+ ", cust_balace=" + cust_balace + "]";
}

//public void setCust_Id(String cust_Id) {
//	this.cust_Id = cust_Id;
//}
//public void setCust_Name(String cust_Name) {
//	this.cust_Name = cust_Name;
//}
//public void setCust_phone(String cust_phone) {
//	this.cust_phone = cust_phone;
//}
//public void setCust_balace(String cust_balace) {
//	this.cust_balace = cust_balace;
//}

public String getCust_Id() {
	return cust_Id;
}

public String getCust_Name() {
	return cust_Name;
}

public String getCust_phone() {
	return cust_phone;
}

public String getCust_balace() {
	return cust_balace;
}


}
