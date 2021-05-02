package Homework3;

public class UserManager {
	
	public void deleteEmail(User user){
		
		System.out.println(user.getEmail() + " your email has been deleted");
	}
	
	public void changeEmail(User user) {
		
		System.out.println("Your email change to " + user.getEmail());
	}
	

}
