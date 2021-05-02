package Homework3;

public class StudentManager {
	
	public void add(Student student) {
		
		System.out.println(student.getFirstName() + " student added");
	}
	
	public void delete(Student student) {
		
		System.out.println(student.getFirstName() + " student deleted");
	}

}
