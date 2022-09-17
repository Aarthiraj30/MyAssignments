package org.college;

public class College  {
	
	public void collegeName() {
		System.out.println("The College Name is" + " " + "AVC College of Engineering");
		
	}
	
	public void collegeCode() {
		System.out.println("The College code is" + " " + "801");
	}
	
	public void collegeRank() {
		System.out.println("The College Rank is" + " " + "64");
	}
	public static void main(String[] args) {

		College details = new College();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		

	}

}
