package student;

import deparment.Department;

public class Student extends Department {
	public void studentName () {
		System.out.println("Student Name");
	}
	
	public void studentDept () {
		System.out.println("Student Department");
	}
	
	public void studentId () {
		System.out.println("Student Id");
	}
public static void main(String[] args) {
	Student student = new Student();
	student.collegeName();
	student.collegeCode();
	student.collegeRank();
	student.studentDept();
	student.studentId();
	student.studentName();
	student.DeptName();
}
}
