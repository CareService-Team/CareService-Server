package com.example.care.model;

public class SenileThing {
	
	private String s_address;
	private String t_name;
	private String t_count;
	private String t_id;
	private String s_id;
	private String request_date;
	
	public SenileThing(String s_address, String t_name, String t_count, String t_id, String s_id, String request_date) {
		super();
		this.s_address = s_address;
		this.t_name = t_name;
		this.t_count = t_count;
		this.t_id = t_id;
		this.s_id = s_id;
		this.request_date = request_date;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_count() {
		return t_count;
	}

	public void setT_count(String t_count) {
		this.t_count = t_count;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getRequest_date() {
		return request_date;
	}

	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}
}
