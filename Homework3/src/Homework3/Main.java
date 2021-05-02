package Homework3;

public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setBranch("Software");
		
		
		Student student = new Student();
		student.setId(01);
		student.setFirstName("Hilal");
		student.setLastName("Kurnaz");
		student.setEmail("hilalkurnaz@gmail.com");
		student.setAge(19);
		student.setDivision("Computer Engineering");
		
		
		
		UserManager userManager = new UserManager();
		userManager.deleteEmail(student);
		userManager.changeEmail(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		

	}

}
