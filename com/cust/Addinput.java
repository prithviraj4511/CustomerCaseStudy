package com.cust;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.enm.ServicePlan;

public class Addinput {
	public static List<Customer> populateCust()
	{
		List<Customer> ll=new ArrayList<>();
		ll.add(new Customer("vishal", "bhagat", "vishalbhagat@56" ,"retyy34" ,5000, LocalDate.parse("2024-03-03"), ServicePlan.GOLD));
		ll.add(new Customer("vishal", "bhagat", "ishalbhagat@56" ,"retyy34" ,10000, LocalDate.parse("2019-03-11"), ServicePlan.PLATINUM));
		ll.add(new Customer("vishal", "bhagat", "shalbhagat@56" ,"retyy34" ,7000, LocalDate.parse("2020-03-03"), ServicePlan.SILVER));
		ll.add(new Customer("vishal", "bhagat", "vihalbhagat@56" ,"retyy34" ,8000, LocalDate.parse("2011-03-03"), ServicePlan.DIAMOND));
		ll.add(new Customer("vishal", "bhagat", "albhagat@56" ,"retyy34" ,5000, LocalDate.parse("2004-03-03"), ServicePlan.GOLD));
		
		return ll;
	}
}
