package com.cust;

import java.time.LocalDate;

import com.enm.ServicePlan;

public class Customer implements Comparable<Customer> {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	// static id generator
	private static int idGenerator;
	static {
		idGenerator = 1;
	}

	public Customer(String firstName, String lastName, String email, String password, double regAmount, LocalDate dob,
			ServicePlan plan) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
		this.customerId = idGenerator++;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}

	@Override
	public boolean equals(Object anotherObj) {
		System.out.println("in customer eq");
		if (anotherObj instanceof Customer)
			return this.email.equals(((Customer) anotherObj).email);
		return false;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	@Override
	public int compareTo(Customer custvehicel) {

		return this.email.compareTo(custvehicel.email);

	}

}
