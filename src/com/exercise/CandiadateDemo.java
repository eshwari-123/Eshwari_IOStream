package com.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CandiadateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate obj=new Candidate();
		List<Integer> n = Arrays.asList(12,23,11,19,35,22);
		Predicate<Integer> age=a->(a>18);
		for(int i:n) {
			System.out.println(age.test(i));
		
		obj.checkAge(i);
		}
	}

}
