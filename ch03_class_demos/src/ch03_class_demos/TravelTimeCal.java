package ch03_class_demos;

import java.util.Scanner;

public class TravelTimeCal {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calc App!");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter miles: ");
			double miles = sc.nextInt();
			
			System.out.println("Enter mph: ");
			double mph = sc.nextInt();
			
			//Calculate estimated drive time (Hours and minutes)
			int hours = (int)(miles/mph);
			double d = miles/mph;
			double dd = miles % mph;
			System.out.println(dd);
			int minutes = (int)((miles % mph)*60);
			
			double hrs = miles/mph;
			int min = (int)(hrs * 60);
			int hrsInt = (int)(min/60);
			int minFinal = min% 60;
			
			System.out.println("Estimated travel Time");
			System.out.println("======================");
			System.out.println("Hours: "+hours);
			System.out.println("Minutes: "+minutes);
			System.out.println("Hours: "+hrsInt);
			System.out.println("Minutes: "+minFinal);
			
			System.out.println("Continue??");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("Bye!");
	}

}
