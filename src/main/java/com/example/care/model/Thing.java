package com.example.care.model;

public class Thing {
	private String t_id;
	private String t_name;
	private String t_remain;
	
	public Thing(String t_id, String t_name, String t_remain) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_remain = t_remain;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_remain() {
		return t_remain;
	}

	public void setT_remain(String t_remain) {
		this.t_remain = t_remain;
	}
}
