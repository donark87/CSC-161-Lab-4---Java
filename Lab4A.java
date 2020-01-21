// Donark Patel
// Lab 4A
// Date - 2/18/2018
// User Input

import java.util.Scanner;
public class Lab4A

{
	public static void main (String [] args)
	{
		// Variables
		int itemQuantity;
		float unitPrice, discountPrice, totalSaving, totalCost, totalDiscount;
		String itemName;
		char category;

		Scanner Keyboard = new Scanner(System.in);

		System.out.println("Enter Item name");
		itemName = Keyboard.nextLine();

		System.out.println("Enter Category");
		category = Keyboard.next().charAt(0);
		category = Character.toUpperCase(category);

		System.out.println("Enter Item Quantity");
		itemQuantity = Keyboard.nextInt();

		System.out.println("Enter unit price & discount price");
		unitPrice = Keyboard.nextFloat();
		discountPrice = Keyboard.nextFloat();

		// Calculation
		totalCost = (unitPrice * itemQuantity);
		totalDiscount = (discountPrice * itemQuantity);
		totalSaving = (totalCost - totalDiscount);

		// assiments

		// Output
		System.out.printf("%s %25s","Item:",itemName);
		System.out.printf("\n%s %20s","Category:",category);
		System.out.printf("\n%s %20d","Quantity:",itemQuantity);
		System.out.printf("\n%s %17.2f %10.2f %s","Unit Cost($)",unitPrice,discountPrice,"With discount");
		System.out.printf("\n%s %16.2f %10.2f ","Total Cost($)",totalCost,totalDiscount);
		//System.out.printf("\n");
		System.out.println("\n-------------------------------------------------------");
		System.out.printf("\n%s %16.2f","You Saved($):",totalSaving);
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.println("Donark patel");
		System.out.println("Lab 4A");
		System.out.println("---------\n\n");
	}
}