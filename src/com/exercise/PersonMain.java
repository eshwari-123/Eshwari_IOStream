package com.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> t= new ArrayList<Person>();
		t.add(new Person("john","abc@gmail.com"));
		t.add(new Person("rohan","xyz@gmail.com"));
		t.add(new Person("chris","wer@gmail.com"));
		t.add(new Person("sonu","sdf@gmail.com"));
		t.forEach(PersonMain::printPersonInfo);
    }
    public static void printPersonInfo(Person person) {
        System.out.println("Person Name: " + person.personName + ", Email: " + person.emailId);
}
}

	

