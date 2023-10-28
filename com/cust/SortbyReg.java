package com.cust;

import java.util.Comparator;

public class SortbyReg implements Comparator<Customer>  {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getRegAmount()>o2.getRegAmount())
			return 1;
		else if(o1.getRegAmount()==o2.getRegAmount())
			return 0;
		else
			return -1;
		
	}
	

}
