package com.project.mini.model;

public class Nurse {
	
	private String email;
	private String name;
	private String address;
	private float salary;
	private String qualifications;
	
	public Nurse() {
		System.out.println("Nurse Class Constructor");
	}

	public Nurse(String email, String name, String address, float salary, String qualifications) {
		super();
		this.email = email;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.qualifications = qualifications;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	@Override
	public String toString() {
		return "Nurse [email=" + email + ", name=" + name + ", address=" + address + ", salary=" + salary
				+ ", qualifications=" + qualifications + "]";
	}
	
}
