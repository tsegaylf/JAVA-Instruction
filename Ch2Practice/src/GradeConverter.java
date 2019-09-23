import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Letter Grade Convertor");
		
		String choice ="y";
		Scanner sc = new Scanner(System.in);
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter numerical grade: ");
			int grade = sc.nextInt();
			System.out.println("Letter Grade: A ");	
			
			while (grade < 60) {
				System.out.println("Letter Grade: "+grade);
				grade--;
			}

		System.out.println("Continue?");
		choice = sc.next();
}
		sc.close();

	}
	}


