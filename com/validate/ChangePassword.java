package com.validate;

import java.util.List;

import com.cust.Customer;

public class ChangePassword {

	public static void authenticateCustomer(String email, String oldPass, String newPass, List<Customer> list)
			throws InvalidInputException {
		Customer c=new Customer(email);
	      int index=list.indexOf(c);
	      if(list.indexOf(index)!=-1) {
	    	  if (email.equals(c.getEmail())) {
					c = list.get(index);
					if (oldPass.equals(c.getPassword())) {
						c.setPassword(newPass);						
					} else {
						throw new InvalidInputException("Password doesn't matched");
					}
				} else {
					throw new InvalidInputException("Invalid Email");
				}
	      }

}
}
//3. Change password
//i/p : email n old password n new password
//custList.indexof()!=-1=> valid email->getEmail()->getIndex->customer details:c
//if (password.equals(c.getPassword()))---t
//setPAssword->setPassword(newPassword)
//ow throw invalid password
//else false throw exc invalidemail
//
////we cant set a value it will change whole object... so use setter...
//declare method authenticatecustomer(email,password)
