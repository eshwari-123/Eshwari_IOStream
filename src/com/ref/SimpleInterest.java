package com.ref;

import byteStream.readStream;

public class SimpleInterest {
	
	
	public void simpleInterestCal(double p,double r,double t) {
		System.out.println(p*r*t/100);
	}
	
	/*public SimpleInterest() {
		System.out.println(p*r*t/100);
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SimpleInterest obj=new SimpleInterest();
		Interest interest=obj::simpleInterestCal;
		interest.calculateInterest(1200, 3, 4);

	}

}
