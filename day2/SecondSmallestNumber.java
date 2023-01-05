package week1.day2;

import java.util.Arrays;
//Assignment 6 day 2
//Second smallest Number in an array

public class SecondSmallestNumber {
public static void main(String[] args) {
	int[] a= {89,45,73,52,99,67,22,80,34};
	Arrays.sort(a);
	System.out.println("The second smallest number is "+a[1]);
}
}
