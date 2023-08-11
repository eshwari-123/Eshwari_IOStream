package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CallDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CallQuality obj=new CallQuality(1, 20, "Excellent", "John");
		String filename="SampleFile";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream outputStream=new ObjectOutputStream(file);
			outputStream.writeObject(obj);
			
			outputStream.close();
			file.close();
			System.out.println("Object has been serialised");
		}
		catch(IOException ex) {
			System.out.println("IOException caught");
		}

	}

}
