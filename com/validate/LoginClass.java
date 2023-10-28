package com.validate;

import java.util.List;

import com.cust.Customer;

public class LoginClass {
	public static void validateLogin(String email, String password, List<Customer> list) throws InvalidInputException {
		Customer c = new Customer(email);
		int index = list.indexOf(c);
//	if (list.contains(c)) {
//		throw new InvalidInputException("");
//	}
		if (index != -1) {
//		System.out.println(c.getEmail());                                                                                               
			if (email.equals(c.getEmail())) {
				c = list.get(index);
				if (password.equals(c.getPassword())) {
					System.out.println(c);
				} else {
					throw new InvalidInputException("Password doesn't matched");
				}
			} else {
				throw new InvalidInputException("Invalid Email");
			}
		}
		
//		c = list.get(index);
//		return c;

	}
}
