// Donark Patel
// Lab 4B
// Date - 2/18/2018
// User Input

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Lab4B

{
	public static void main (String [] args)
	{
		// Variables
		int joeSales,annSales,bettySales, totalWidgetsWeight;
		float joePrice,annPrice, bettyPrice,averagePrice,lastYearAveragePrice,increase;
		String str, joeSalesInput,annSalesInput,bettySalesInput,joePriceInput,annPriceInput,bettyPriceInput ;
		lastYearAveragePrice = 19.11f;

		DecimalFormat lbs = new DecimalFormat ("#00lbs");
		DecimalFormat price = new DecimalFormat ("$#00.00");
		DecimalFormat percent = new DecimalFormat ("#0.0%");

		 str = JOptionPane.showInputDialog("How many Lb's of widgets Joe has sold?");
		 joeSales = Integer.parseInt(str);

		 str = JOptionPane.showInputDialog("What is the price of the widgets that Joe has sold?");
		 joePrice = Float.parseFloat(str);

		 str = JOptionPane.showInputDialog("How many Lb's of widgets Ann has sold?");
		 annSales = Integer.parseInt(str);

		 str = JOptionPane.showInputDialog("What is the price of the widgets that Ann has sold?");
		 annPrice = Float.parseFloat(str);

		 str = JOptionPane.showInputDialog("How many Lb's of widgets Betty has sold?");
		 bettySales = Integer.parseInt(str);

		 str = JOptionPane.showInputDialog("What is the price of the widgets that Betty has sold?");
		 bettyPrice = Float.parseFloat(str);

		// Calculation
		totalWidgetsWeight = joeSales + annSales + bettySales;

		averagePrice = ((joeSales*joePrice)+(annSales*annPrice)+(bettySales*bettyPrice))/(totalWidgetsWeight);

		increase=(averagePrice/lastYearAveragePrice)-1f;

		// assiments

		// Output
		JOptionPane.showMessageDialog(null,"A total of "+lbs.format(totalWidgetsWeight)+"lbs of widgets were sold at an average price of "
										+price.format(averagePrice)+".\n"+ "The details for each salespersons are:\n\n"
										+"               Number          Price\n"
										+"Joe            "+lbs.format(joeSales)+"           "+price.format(joePrice)
										+"\nAnn           "+lbs.format(annSales)+"           "+price.format(annPrice)
										+"\nBetty         "+lbs.format(bettySales)+"           "+price.format(bettyPrice)+"\n\n"
										+"This represents a "+percent.format(increase)+"increase from last month");














		System.out.println(totalWidgetsWeight);
		System.out.printf("%.2f",averagePrice);
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.println("Donark patel");
		System.out.println("Lab 4");
		System.out.println("---------\n\n");
	}
}