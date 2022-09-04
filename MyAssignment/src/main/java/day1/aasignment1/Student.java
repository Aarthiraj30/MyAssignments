package day1.aasignment1;

public class Student {
	
	private void classReport() {
		// TODO Auto-generated method stub

		String studentName = "Aarthi";
		System.out.println("The Student Name is" + " "  + studentName);
		int rollNo = 401;
		System.out.println("Roll Number of the student is" + "  "  + rollNo);
		String collegeName = "AVC College of Engineering";
		System.out.println("The College Name is" + " " + collegeName);
		int marksScored = 458;
		System.out.println("The Marks Obtained is" + " " + marksScored);
		float cgpaScore = 9.1f;
		System.out.println("The CGPA SCORE is" + " " + cgpaScore);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student report = new Student();
		report.classReport();
    
		
		
	}

}
