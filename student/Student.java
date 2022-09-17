package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("The Student Name is " + " " + "Aarthi Muthukumarasamy" );
		
	}
	public void studentDepartment() {
		System.out.println("The Student Studying in ECE Departmnet" );
			}
	
	public void studentId() {
		System.out.println("The Roll no is " + " " + "04EC01");
	}

	public static void main(String[] args) {

		Student details = new Student();
		details.studentName();
		details.studentDepartment();
		details.studentId();
		details.deptName();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
	}

}
