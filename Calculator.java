package week1.day1;

public class Calculator {
	public void sub() {
		int a=5;
		int b=15;
	    int c=b-a;
	    System.out.println(c);
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.sub();
	int result=cal.mul(40, 20);
	System.out.println(result);
	
	
}
}
