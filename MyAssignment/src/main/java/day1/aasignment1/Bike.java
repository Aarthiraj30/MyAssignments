package day1.aasignment1;

public class Bike {

	public void applyBreak() {
		// TODO Auto-generated method stub
         System.out.println("APPLIED BREAK");
	}
	 
	public void soundHorn() {
		
		System.out.println("Sound Horn");
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car action = new Car();
		action.applyBreak();
		action.soundHorn();
		
		Bike action1 = new Bike();
		action1.applyBreak();
		action1.soundHorn();
	}

}
