package com.javaGenerics;
import java.util.Scanner;
public class MaxFloat {
	
		static Scanner sc = new Scanner(System.in);
		/*
		 * UC2 Given 3 Float find the maximum
		 */
		public void maxmumFloatNum(Float A, Float B, Float C) {
			Float max = A;
			if (B.compareTo(max) > 0) {
				max = B;
			}
			if (C.compareTo(max) > 0) {
				max = C;
			}
			System.out.println("The maximum Float value is : " + max);
		}

		public static void main(String[] args) {
			MaxFloat g = new MaxFloat();

			g.maxmumFloatNum(50.4f, 20.0f, 30.0f);
		}

	}
	
	
	
	

