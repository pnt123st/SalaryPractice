package sales;

import java.util.Scanner;

public class SalesReceipt2 {
	
	//Global variable
	static String customerName;
	static String productName;
	static int unitPurchased;
	static double unitPrice;
	static double amountToPay;
   // static double changeAmount;
    
//==Module 1
public static void salesPrepareInstruction() {
		System.out.println("Product sales reciept ===V1.0===");
		System.out.println("Please follow the instruction for your purchased receiept");	
}

//==Module 2
public static void getInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter Customer Name : ");
		customerName = scanner.nextLine();
		
		System.out.println("Product Name : ");
		productName = scanner.nextLine();
		
		System.out.println("The number of product purchased : ");
		unitPurchased = scanner.nextInt();
		
		System.out.println("The price for per unit is : ");
		unitPrice = scanner.nextDouble();
		scanner.close();
}

////==Module 3
public static void process() {
		amountToPay = unitPurchased * unitPrice;
}

//==Module 4
public static void displayOutput() {
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("====================Sales Receiept====================");
		System.out.println(" ");
		System.out.println("Customer's name is : " + customerName);
		System.out.println("Number of unit purchased : " + unitPurchased);
		System.out.println("Per unit price is : " + unitPrice);
		System.out.println("------------------------------------------------------");
		System.out.println( "Total amount to pay in $ is : " + amountToPay);
}

/*public static void change() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please Enter the amount to pay : ");
	changeAmount = scanner.nextDouble();
	scanner.close();
}*/

public static void main(String[] args) {

	salesPrepareInstruction();
	 getInput();
	 process();
	 displayOutput();
	 //change() ;
  }
}


