package employeeSalaryCalculator;

import java.util.Scanner;

public class CalculatorV2 {
	
	 //==All Global Variables
	  static String nameOfEmployee;
	  static double numberOfHoursWorked;
	  static int hourlyPayRate;
	  static double grossPay;

//==Module 1
public static void calculatorSystemInstruction() {
	  System.out.println("Employee Payment Calculator ===v1.0 ===");
	  System.out.println("Please folow the instructions which is given below : ");
}
	
//==Module 2
public static void getInput() {
	   Scanner scanner= new Scanner(System.in);
		 
	   System.out.println("Enter Employee Name : ");
	   nameOfEmployee=scanner.nextLine();
		 
	   System.out.println("Enter total numbers of hour worked : ");
	   numberOfHoursWorked=scanner.nextDouble();
		
		System.out.println("Enter hourly pay rate : ");
		hourlyPayRate=scanner.nextInt();
		scanner.close();
}
//==Module 3	
public static void process() {
		grossPay = numberOfHoursWorked * hourlyPayRate;
}
//==Module 4	
public static void displayOutput() {
	    
		System.out.println(" ");
		
		
		System.out.println("=====Employees Pay Slip====");
		System.out.println(" ");
		System.out.println("The name of the employee is : " + nameOfEmployee);
		System.out.println("The number of hour employee worked : " + numberOfHoursWorked);
		System.out.println("Hourly pay rate for the employee is : " + hourlyPayRate);
		System.out.println("==============================================");
		System.out.println("Total gross pay for the employee is : " + grossPay);
}
//Main Module	
public static void main(String[] args) {
	    
	    //Calling all module here
	    calculatorSystemInstruction();
	    getInput();
	    process();
	    displayOutput();
	    
	    /*getInput();
	    process();
	    displayOutput();
	    
	    getInput();
	    process();
	    displayOutput();
	    
	    getInput();
	    process();
	    displayOutput();*/
  }
}
