package org.dem.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name = "Emp_ID",unique=true)
	private int empId;
	@Column(name = "Basic_Salary")
	private int basicpay;
	@Column(name = "DA")
	private int dearnessAllowance;
	@Column(name = "Emp_Name",length=150,nullable=false)
	private String name;
	@Column(name = "Email_ID",unique=true)
	private String email;
	@Column(name = "HRA")
	private int houseRentAllowance;
	@Column(name = "PF")
	private int providentFund;
	@Column(name = "TA")
	private int travelAllowance;
	@Column(name = "Phone_number",unique=true)
	private long phoneNumber;
	
	

	public Employee(int empId, int basicpay, int dearnessAllowance, String name, String email, int houseRentAllowance,
			int providentFund, int travelAllowance, long phoneNumber) {
		
		this.empId = empId;
		this.basicpay = basicpay;
		this.dearnessAllowance = dearnessAllowance;
		this.name = name;
		this.email = email;
		this.houseRentAllowance = houseRentAllowance;
		this.providentFund = providentFund;
		this.travelAllowance = travelAllowance;
		this.phoneNumber = phoneNumber;
	}

	public int getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(int basicpay) {
		this.basicpay = basicpay;
	}

	public int getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(int dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public int getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(int houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public int getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(int providentFund) {
		this.providentFund = providentFund;
	}

	public int getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(int travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


};
