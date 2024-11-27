import java.util.*;

public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input Product Name   : ");
		String ProductName = input.nextLine();
		System.out.print("Input Product Unit   : ");
		int ProductUnit = input.nextInt();
		System.out.print("Input Price per Unit : ");
		double PriceperUnit = input.nextDouble();
		
		System.out.println("------------------------------------");
		
		double totalPrice = ProductUnit*PriceperUnit;
		String frmtotalPrice = String.format("%,.2f",totalPrice);
		
		System.out.println("Total Price is "+frmtotalPrice+" baht.");
		
		System.out.println("------------------------------------");
		
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		
		double totalDiscount = totalPrice*discount/100;
		double totalPricewithDiscount = totalPrice-totalDiscount;
		
		System.out.println("------------------------------------");
		
		String frmtotalDiscount = String.format("%,.2f",totalDiscount);
		String frmtotalPricewithDiscount = String.format("%,.2f",totalPricewithDiscount);
		
		System.out.println("Discount from "+discount+"% : 	"+frmtotalDiscount+" baht.");
		System.out.println("Amount to be paid : 	"+frmtotalPricewithDiscount+" baht.");
		
		input.close();

	}

}
