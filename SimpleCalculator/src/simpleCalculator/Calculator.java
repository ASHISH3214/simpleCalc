package simpleCalculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter First Value: ");
	    String s1 = scanner.nextLine();
	    
	    Double d1 = Double.parseDouble(s1);
	    
	    Scanner scanner2 = new Scanner(System.in);
	    
	    System.out.println("Enter Second Value: ");
	    String s2 = scanner2.nextLine();
	    
	    Double d2 = Double.parseDouble(s2);
	    
	    Double result = d1+d2;
	    
	    System.out.println("answer is: " + result);
	    
	    
		
	}

}
