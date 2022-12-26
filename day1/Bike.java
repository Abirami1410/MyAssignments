package week1.day1;
//Assignment 4


public class Bike {
	public void accelerate() {
		System.out.println("accelerate the bike");

	}
	public static void main(String[] args) {
        Bike b=new Bike();
        b.accelerate();
		Car c=new Car();
		c.applyBreak();
		c.soundHorn();
	}

}
