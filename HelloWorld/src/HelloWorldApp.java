import java.util.Scanner;

public class HelloWorldApp {

	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		
		String choice ="y";
		Scanner sc = new Scanner(System.in);
		while(choice.equalsIgnoreCase("y")) {
		
		int a = 5;
		double b =5.5;
		System.out.println("Total is "+(a+b));
		
		
		String name = "Lidya ";
		name = name + "P ";
		name += "Tsegay";
		System.out.println(name);
		
		//StringBuilder Example
		StringBuilder sb = new StringBuilder("Tricia ");
		sb.append("M ");
		sb.append("Good");
		System.out.println(sb);
		
		//Scanner used to get output from the console
		System.out.println("Enter first name: ");
		String firstName = sc.next();
		System.out.println("Firstname: " +firstName);
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Age: "+age);
		
		while (age > 0) {
			System.out.println("age is "+age);
			age--;
		}
		
		System.out.println("Continue?");
			choice = sc.next();
	}
		sc.close();

		
	}

}
