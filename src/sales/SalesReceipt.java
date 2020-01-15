package sales;

import java.util.Scanner;

public class SalesReceipt {
	

	public static void main(String[] args) {
		
		String customerName;
		int unitPurchased;
		double unitPrice;
		double amountToPay;
		
		System.out.println("Product sales reciept ===V1.0===");
		System.out.println("Please follow the instruction for your purchased receiept");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter Customer Name : ");
		customerName = scanner.nextLine();
		
		System.out.println("The number of product purchased : ");
		unitPurchased = scanner.nextInt();
		
		System.out.println("The price for per unit is : ");
		unitPrice = scanner.nextDouble();
		
		
		amountToPay = unitPurchased * unitPrice;
		System.out.println("The total amount to pay is : " + amountToPay);
		scanner.close();
		
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

}
