package com.javaGenerics;

public class MaximumStrings {

		/*
		 * UC3 Given 3 Strings find the maximum
		 */
		public void maxmumStringNum(String A, String B, String C) {
			String max = A;
			if (B.compareTo(max) > 0) {
				max = B;
			}
			if (C.compareTo(max) > 0) {
				max = C;
			}
			System.out.println("The maximum String value is : " + max);

		}
		public static void main(String[] args) {
			MaximumStrings g = new MaximumStrings();
			

			g.maxmumStringNum("orange", "apple", "pear");
		}

}
	
	
	

