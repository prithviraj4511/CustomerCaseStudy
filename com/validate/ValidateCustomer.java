package com.validate;

import java.time.LocalDate;
import java.util.List;

import com.cust.Customer;
import com.enm.ServicePlan;

public class ValidateCustomer {
	// add a method to parse n validate service plan
	public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	// add a method to validate reg amount with the plan
	public static void validatePlanAmount(ServicePlan plan, double regAmount) throws InvalidInputException {
		if (plan.getAdditionalAmount() != regAmount)
			throw new InvalidInputException("Reg amount doesn't match with the plan !!!!!");

	}

	public static void checkDuplicateEmail(String email, List<Customer> list) throws InvalidInputException {
		Customer customer = new Customer(email);
		if (list.contains(customer)) {
			throw new InvalidInputException("Email Already Exists");
		}
	}

	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}

	// add a method to call validation rules
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			double regAmount, String dob, String plan, List<Customer> customer) throws InvalidInputException {
		ServicePlan validatedPlan = parseAndValidatePlan(plan);
		validatePlanAmount(validatedPlan, regAmount);
		LocalDate date = parseDate(dob);
		checkDuplicateEmail(email, customer);
		return new Customer(firstName, lastName, email, password, regAmount, date, validatedPlan);
	}
}
