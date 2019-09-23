package ch03_class_demos;

import java.text.NumberFormat;

public class NumberDemosApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		//demo some of the Math Class Methods
		
		//RANDOM #s
		//double r = Math.random() * 10;
		int r = (int)(Math.random() * 10); // explicit cast
		System.out.println(r);
		
		//ROUNDING #s
		double d = 4.567;
		d *= 100;
		double dr = Math.round(d);
		dr /= 100;
		System.out.println(dr);
		
		//MAX and MIN #s
		double m = Math.max(5.7,  3.2);
		System.out.println(m);

		double mi = Math.min(5.7,  3.2);
		System.out.println(mi);
		
		//CURRENCY
		double price = 45565.77;
		System.out.println(price);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println(currency.format(price));
		
		//PERCENT 
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(2);
		double interest = .0745;
		System.out.println(percent.format(interest));

		System.out.println("Bye");
	
	}

}
