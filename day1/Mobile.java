package week1.day1;
// Assignment 2:

public class Mobile {
    // Creating 2 methods 
	
	public void makeCall() {
		String mobileModel="Honor 8X";
		float mobileWeight=90.89f;
		System.out.println("call a number");
        System.out.println("Mobile model is "+mobileModel);
        System.out.println("mobile weight is "+mobileWeight);
	}
	
	public void sendMsg() {
	    boolean fullyCharged=true;
	    int mobileCost=20000;
	    System.out.println("Send a message");
        System.out.println("Does mobile is fully charged "+fullyCharged);
        System.out.println("Cost of the mobile "+ mobileCost);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.makeCall();
		m.sendMsg();
		System.out.println("This is my mobile");
	}

}
