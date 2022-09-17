package polymorphism;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println(" The ID is " + " "+ id);
		
	}
	
	public void getStudentInfo(int id,String name){
		
		System.out.println("The ID is " + " "+ id);
		System.out.println("The Student Name is " + " " + name);
	}
	
	public void getStudentInfo(String emailid,long phonenumber) {
		System.out.println("The student Email ID is"+ " " + emailid);
		System.out.println("The student PhoneUmber is"+ " " + phonenumber);
	}

	public static void main(String[] args) {

	 Students details = new Students();
	 details.getStudentInfo(401);
	 details.getStudentInfo(01, "Aarthi");
	 details.getStudentInfo("aarthiaug@yahoo.co.in", 9487241245L);
	}

}
