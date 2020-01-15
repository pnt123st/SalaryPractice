package employeeSalaryCalculator;

import java.util.Scanner;

public class CalculatorV1 {

	public static void main(String[] args) {
	   
		//Declaring all variables with appropriate Data Type
		
		String nameOfEmployee;
		double numberOfHoursWorked;
		double hourlyPayRate;
		double grossPay;
		
		//Displaying the welcome message and instruction for the user
		System.out.println("Employee Payment Calculator v1.0====");
		System.out.println("Please folow the instructions which is given below : ");
		
		//The program takes input from user, so enhancing application here
		
		
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter Employee Name : ");
		 nameOfEmployee=scanner.nextLine();
		 
		 System.out.println("Enter total numbers of hour worked : ");
		numberOfHoursWorked=scanner.nextDouble();
		
		System.out.println("Enter hourly pay rate : ");
		hourlyPayRate=scanner.nextDouble();
		
		//Calculating worked Payment
		grossPay = numberOfHoursWorked * hourlyPayRate;
		System.out.println("The grossPay is : " + grossPay);
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("=====Employees Pay Slip====");
		System.out.println(" ");
		System.out.println("The name of the employee is : " + nameOfEmployee);
		System.out.println("The number of hour employee worked : " + numberOfHoursWorked);
		System.out.println("Hourly pay rate for the employee is : " + hourlyPayRate);
		System.out.println("==============================================");
		System.out.println("Total gross pay for the employee is : " + grossPay);
		scanner.close();
		}
}
