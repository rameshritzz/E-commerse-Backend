package com.niit.ecombackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserCred {
@Id
String emailid;

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getUser_password() {
	return user_password;
}

public void setUser_password(String user_password) {
	this.user_password = user_password;
}

public String getUser_role() {
	return user_role;
}

public void setUser_role(String user_role) {
	this.user_role = user_role;
}

public String getUser_status() {
	return user_status;
}

public void setUser_status(String user_status) {
	this.user_status = user_status;
}

String user_password;


String user_role;

String user_status;

}
