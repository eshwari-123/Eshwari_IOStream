package com.consumer;
import java.util.function.Consumer;
public class ConsumerDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item item1=new Item(1, "Coffee", 30);
		Consumer <Item> consumer=(e)->System.out.println("Item name" +e.getItemName()+"Item price" +e.getPrice());
		Consumer<Item> c1=(e)->System.out.println("Discount on price" +e.getPrice()*10/100);
		consumer.andThen(c1).accept(item1);
	}

}
