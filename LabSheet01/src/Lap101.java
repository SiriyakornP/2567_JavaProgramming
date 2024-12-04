import java.text.DecimalFormat;
import java.util.*;

public class Lap101 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name  : ");
		String productName = scan.nextLine();
		
		System.out.print("Input product Unit  : ");
		int productUnit = scan.nextInt();
		
		System.out.print("Input product price  : ");
		float productPrice = scan.nextFloat();
		
		System.out.println("-----------------------------------------------------------------");
		float totalPrice = productUnit * productPrice;
		System.out.println("Total price is " + frm.format(totalPrice) + " baht.");
		System.out.println("-----------------------------------------------------------------");
		System.out.print("How many discount (%) : ");
		float Discount = scan.nextFloat();
		System.out.println("-----------------------------------------------------------------");
		float totalDiscount = Discount / 100; 
		float totalPriceDis = totalPrice - (totalPrice * totalDiscount);
		float   total = totalPrice - totalPriceDis;
		System.out.println(String.format("Discount from %.0f",Discount) +"% " + frm.format(total) + "baht");
		System.out.println("Amount to be paid " + frm.format(totalPriceDis) + " baht.");
		
		scan.close();


	}

}
