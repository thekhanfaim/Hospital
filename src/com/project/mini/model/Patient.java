package com.project.mini.model;

public class Patient {
	
	private String email;
	private String name;
	private String teblets;
	private String status;
	
	public Patient() {
		System.out.println("Patient Class Constructor");
	}

	public Patient(String email, String name, String teblets, String status) {
		super();
		this.email = email;
		this.name = name;
		this.teblets = teblets;
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeblets() {
		return teblets;
	}

	public void setTeblets(String teblets) {
		this.teblets = teblets;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Patient [email=" + email + ", name=" + name + ", teblets=" + teblets + ", status=" + status + "]";
	}
	
}
