package com.example.care.model;

public class SenileProfile {
	private String s_id;
	private String s_password;
	private String s_name;
	private String s_phone;
	private String s_gender;
	private String s_address;
	private String s_birth;
	
	public SenileProfile(String s_id, String s_password, String s_name, String s_phone, String s_gender,
			String s_address, String s_birth) {
		super();
		this.s_id = s_id;
		this.s_password = s_password;
		this.s_name = s_name;
		this.s_phone = s_phone;
		this.s_gender = s_gender;
		this.s_address = s_address;
		this.s_birth = s_birth;
	}
	
	public String getS_id() {
		return s_id;
	}
	
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	
	public String getS_password() {
		return s_password;
	}
	
	public void setS_password(String s_password) {
		this.s_password = s_password;
	}
	
	public String getS_name() {
		return s_name;
	}
	
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	
	public String getS_phone() {
		return s_phone;
	}
	
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	
	public String getS_gender() {
		return s_gender;
	}
	
	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}
	public String getS_address() {
		return s_address;
	}
	
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	
	public String getS_birth() {
		return s_birth;
	}
	
	public void setS_birth(String s_birth) {
		this.s_birth = s_birth;
	}
}
