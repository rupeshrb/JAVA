package com.login;

public class Login {
private String user_name;
private String user_password;
private String port;
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Login [user_name=" + user_name + ", user_password=" + user_password + ", port=" + port + "]";
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public void setPort(String port) {
	this.port = port;
}

}
