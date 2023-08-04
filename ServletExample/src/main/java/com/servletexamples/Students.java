package com.servletexamples;

public class Students {
	private int std_id;
	private String std_name;
	private String std_mobile;
	private String std_email;
	
	public Students(int std_id, String std_name, String std_mobile, String std_email) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_mobile = std_mobile;
		this.std_email = std_email;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getStd_mobile() {
		return std_mobile;
	}

	public void setStd_mobile(String std_mobile) {
		this.std_mobile = std_mobile;
	}

	public String getStd_email() {
		return std_email;
	}

	public void setStd_email(String std_email) {
		this.std_email = std_email;
	}}
