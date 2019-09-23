import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		
		System.out.println("Student Registration Form");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Firstname: ");
		String firstName = sc.next();
		System.out.println("Firstname: " +firstName);
		
		System.out.println("Enter Lastname: ");
		String lastName = sc.next();
		System.out.println("Lastname: "+lastName);
		
		System.out.println("Enter Year of Birth: ");
		String birthYear = sc.next();
		System.out.println("Birth year: "+birthYear);
		
		System.out.println("Welcome " +firstName + " " + lastName +"!");
		System.out.println("Your Registration is Complete!");
		System.out.println("Your Temporary Password is: " +firstName+"*"+birthYear);
		
		
		sc.close();
	}

}
