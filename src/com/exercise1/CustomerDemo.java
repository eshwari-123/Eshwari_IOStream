package com.exercise1;

import java.util.ArrayList;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> item=new ArrayList<>();
		item.add(new Customer("Erric", "Top up", "Hyd", 1812));
		item.add(new Customer("Peter", "All in one", "Pune", 999));
		item.sort((i,j)->i.getCustomerName().compareTo(j.getCustomerName()));
		item.forEach(System.out::println);
		item.removeIf((i)->i.getPlanAmount()>200);
		item.forEach(System.out::println);
	}

	

}
