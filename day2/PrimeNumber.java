package week1.day2;

//Assignment 1 day 2
//Assignment PrimeNumber......
public class PrimeNumber {
	public static void main(String[] args) {
		int n=9;
		boolean flag=false;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
		    flag=true;
			break;
			}
		}
		if(!flag) {
			System.out.println(n+" is a prime number");
		}
		else
			System.out.println(n+ " is not a prime number");	
		}
}