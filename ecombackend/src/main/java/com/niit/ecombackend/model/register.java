package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class register {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int reg_Id;
	@Column(nullable = false, unique = true)
	@NotEmpty(message = "USER NAME CAN NOT BE BLANK")
	@Pattern(regexp = "[a-zA-Z ]*", message = "USERNAME  CAN ONLY HAVE ALPHABETS")
	String reg_Name;
	@Column(nullable = false, unique = true)
	@NotEmpty(message = "EMAIL CAN NOT BE BLANK")
//	@Pattern(regexp = "^[\\\\w-\\\\+]+(\\\\.[\\\\w]+)*@[\\\\w-]+(\\\\.[\\\\w]+)*(\\\\.[a-z]{2,})$*", message = "INVALID EMAILID")
	@Email(message="NOT PROPER EMAIL FORMAT")
	String reg_Email;
	@Column(nullable = false, unique = true)
//	@Range(max = 10)
	@Pattern(regexp="[9876][0-9]{9}",message="Number must begin with 9867 and most have 10 digit")
	String reg_Phno;
	@Column(nullable = false, unique = true)
	@NotEmpty(message = "PASSWORD CAN NOT BE BLANK")
//	@Pattern(regexp = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})", message = "INVALID PASSWORD")
	@Transient
	String reg_Pass;

	public int getReg_Id() {
		return reg_Id;
	}

	public void setReg_Id(int reg_Id) {
		this.reg_Id = reg_Id;
	}

	public String getReg_Name() {
		return reg_Name;
	}

	public void setReg_Name(String reg_Name) {
		this.reg_Name = reg_Name;
	}

	public String getReg_Email() {
		return reg_Email;
	}

	public void setReg_Email(String reg_Email) {
		this.reg_Email = reg_Email;
	}

	
	public String getReg_Phno() {
		return reg_Phno;
	}

	public void setReg_Phno(String reg_Phno) {
		this.reg_Phno = reg_Phno;
	}

	public String getReg_Pass() {
		return reg_Pass;
	}

	public void setReg_Pass(String reg_Pass) {
		this.reg_Pass = reg_Pass;
	}

}
