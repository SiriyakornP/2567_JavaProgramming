import javax.swing.*;
import java.text.*;
public class Example201 {

	public static void main(String[] args) 
	{
		final int BUFFET = 299;
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill"));
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int isMember;
		double totalPrice = numberofCustomer * BUFFET;
		do 
		{
			isMember = JOptionPane.showConfirmDialog(null, "Total Price is " +
		totalPrice +
		" baht." +
		"\nDo you have a member card");
			
		}while(isMember==2);
		double discount;
		
		
	    if(isMember==0)
	    {
	    	discount = totalPrice * 0.90;//discount = totalPrice - (totalPrice *10/100)
	    	JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(discount) + " baht.");
	    }
	    else if(isMember==1) // isMember==JOptionPane.NO_OPTION
	    {
	    	JOptionPane.showMessageDialog(null, "Amount to be paid is" + frm.format(totalPrice) + " baht.");
	    }

	}

}
