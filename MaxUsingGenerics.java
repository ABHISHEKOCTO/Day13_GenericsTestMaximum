package com.javaGenerics;
import java.util.Scanner;

	public class MaxUsingGenerics<T extends Comparable<T>>  {
/**
 * This class is made to calculate arithmatic operations and generics are used
 * @author abhishek
 *
 * @param <T>
 */
		T A,B,C,D;
		public MaxUsingGenerics(T A, T B, T C,T D) {
			this.A=A;
			this.B=B;
			this.C=C;
			this.D=D;
		}
		
		public T maxThreeInterFloatString() {
			return MaxUsingGenerics.maximum(A, B, C);
		}
		
		public T maxForeInterFloatStringNew() {
			return MaxUsingGenerics.maximum1(A, B, C, D);
			
		}
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

		/*
		 * Refactor all the 3 to One Generic Method and find the maximum
		 * 
		 */
		public static <T extends Comparable<T>> T maximum(T A, T B, T C) {
			T max = A;
			if (B.compareTo(max) > 0) {
				max = B;
			}
			if (C.compareTo(max) > 0) {
				max = C;
			}
			System.out.println("The maximum String value is : " + max);
			return max;

		}

		/*
		 * UC4
		 * Extend the max method to take more then three parameters
		 * 
		 */
		
		public static <T extends Comparable<T>> T maximum1(T A,T B,T C,T D) {
			T max = A;
			if (B.compareTo(max) > 0) {
				max = B;
			}
			if (C.compareTo(max) > 0) {
				max = C;
			}
			if (D.compareTo(max) > 0) {
				max = D;
			}
			System.out.println("The maximum String value is : " + max);
			return max;
		}
		/*
		 * UC5
		 * 
		 */
		 /**
     
		public static <T>void printMax(T a,T B,T C,T max) {
			System.out.println("This max element is : "+max);
		}
		
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {

			new MaxUsingGenerics(2,450,5,6).maxThreeInterFloatString();
			new MaxUsingGenerics(20.0f,30.0f,5.0f,6.0f).maxForeInterFloatStringNew();
			new MaxUsingGenerics("Pear", "apple", "orange","Apple").maxForeInterFloatStringNew();

		}

}

