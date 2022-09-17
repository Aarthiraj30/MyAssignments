package org.department;

import org.college.College;

public class Department extends College {
	public void deptName() {
		System.out.println("The Department name is "+ " "+ "ECE");
	}

	public static void main(String[] args) {
		
		Department name = new Department();
		name.deptName();
		name.collegeCode();
		name.collegeName();
		name.collegeRank();
		
	}

}
