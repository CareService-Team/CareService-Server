package com.example.care.model;

public class Welfareworker {
	private String w_id;
	private String w_password;
	private String w_name;
	private String w_phone;
	private String w_gender;
	private String w_birth;
	
	public Welfareworker(String w_id, String w_password, String w_name, String w_phone, String w_gender,
			String w_birth) {
		super();
		this.w_id = w_id;
		this.w_password = w_password;
		this.w_name = w_name;
		this.w_phone = w_phone;
		this.w_gender = w_gender;
		this.w_birth = w_birth;
	}

	public String getW_id() {
		return w_id;
	}

	public void setW_id(String w_id) {
		this.w_id = w_id;
	}

	public String getW_password() {
		return w_password;
	}

	public void setW_password(String w_password) {
		this.w_password = w_password;
	}

	public String getW_name() {
		return w_name;
	}

	public void setW_name(String w_name) {
		this.w_name = w_name;
	}

	public String getW_phone() {
		return w_phone;
	}

	public void setW_phone(String w_phone) {
		this.w_phone = w_phone;
	}

	public String getW_gender() {
		return w_gender;
	}

	public void setW_gender(String w_gender) {
		this.w_gender = w_gender;
	}

	public String getW_birth() {
		return w_birth;
	}

	public void setW_birth(String w_birth) {
		this.w_birth = w_birth;
	}
}
