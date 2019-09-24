import java.util.Scanner;

public class ch04TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squared and Cubed Table");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while(choice.equalsIgnoreCase("y")) {
		System.out.println("Enter an integer: ");
		
		
		int n = sc.nextInt();
		System.out.println("Number   "+ "Squared   "+ "Cubed   ");
		System.out.println("======= "+ "======== "+ "====== ");
		for(int i=1; i<=n; i++) {
		
			System.out.println("     "+ i +"      "+i*i +"      "+i*i*i);
			
		}
		System.out.println("Continue??");
		choice = sc.next();

		System.out.println("Goodbye");
		
		}
	}
	}


