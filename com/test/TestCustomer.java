package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static com.validate.ValidateCustomer.validateAllInputs;
import com.cust.Customer;
import com.cust.SortbyReg;

import static com.validate.LoginClass.validateLogin;
import static com.cust.Addinput.populateCust;
public class TestCustomer {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> custList =populateCust();

			boolean exit = false;
			while (exit != true) {
				System.out.println("1.Register   2.Login  3.Display all customers 4. sort by email 5. sort by regamount  0.Exit");
				System.out.println("Enter Choice");
				switch (sc.nextInt()) {
				case 1:
					System.out.println(
							"Enter Details: firstName, lastName,  email,  password,  regAmount,  dob, Serviceplan");
					Customer c1 = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
							sc.next(), sc.next(), custList);
					custList.add(c1);
					System.out.println("Customer added");
					break;
				case 2:
					System.out.println("Enter email and password to login");
					validateLogin(sc.next(), sc.next(), custList);
					System.out.println("Login Success");
					break;
				case 3:
					for (Customer c : custList) {
						System.out.println(c);
					}
					break;
				case 4:
					
					Collections.sort(custList);
					break;
				case 5:
					Collections.sort(custList,new SortbyReg());
					
					break;
				case 6:
					Collections.sort(custList, new Comparator<Customer>(){

						@Override
						public int compare(Customer o1, Customer o2) {
							int re;
							return re=o1.getDob().compareTo(o2.getDob());
							
						}
						
					});
					break;
				case 0:
					exit = true;
					break;
				default:
					System.out.println("Invalid");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
