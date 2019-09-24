import java.util.Scanner;

public class ch04FactorialCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while(choice.equalsIgnoreCase("y")) {
		System.out.println("Enter an integer: ");
		
		
		
		
		System.out.println("Continue??");
		choice = sc.next();
		}
		System.out.println("Goodbye!");
	}

}
