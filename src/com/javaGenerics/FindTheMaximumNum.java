package com.javaGenerics;
import java.util.Scanner;
public class FindTheMaximumNum {

	
		static Scanner sc = new Scanner(System.in);

		/*
		 * UC1 Given 3 Interger find the maximum
		 */
		public void maxmumIntegerNum(Integer A, Integer B, Integer C) {
			Integer max = A;
			if (B.compareTo(max) > 0) {
				max = B;
			}
			if (C.compareTo(max) > 0) {
				max = C;
			}
			System.out.println("The maximum Integer value is : " + max);
		}

		
		public static void main(String[] args) {
			FindTheMaximumNum g = new FindTheMaximumNum();
			
			g.maxmumIntegerNum(54, 56, 61);

		}

	}
	
	
	
	

