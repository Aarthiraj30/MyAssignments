package day1.aasignment1;

public class Mobile {
	
	public void makeCall() {
		// TODO Auto-generated method stub
     String mobileModel = "MOTOROLLA";
     float mobileWeight = 15f;
     System.out.println("My MObile model is MOTOROLLA");
      
	}
	public void sendMsg() {
		// TODO Auto-generated method stub
    boolean isFullyCharged = true;
    
    int mobileCost = 15000;
    System.out.println("My MObile Cost is" + "  "  + mobileCost);
	}

	public static void main(String[] args) {
	
		Mobile status = new Mobile();
		status.makeCall();
		status.sendMsg();
		System.out.println("This is my new Mobile");

	}

}
