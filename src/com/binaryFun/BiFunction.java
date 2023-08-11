package com.binaryFun;

import java.util.function.BinaryOperator;

public class BiFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Apply BinaryOperator.maxBy to compare 2 
		 * Item objects based on price and get the 
		 * item with max price
		 */

		BinaryOperator<Bifun> binaryOperator = BinaryOperator.maxBy(
                (Bifun i1, Bifun i2) -> i1.getPrice() - i2.getPrice());

        Bifun item1 = new Bifun("first",10);
        Bifun item2 = new Bifun("second",20);

        Bifun max = binaryOperator.apply(item1, item2);

        System.out.println(max);
	}
}
