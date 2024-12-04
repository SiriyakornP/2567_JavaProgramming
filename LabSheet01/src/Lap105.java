import javax.swing.*;

public class Lap105 {

	public static void main(String[] args) 
	{
		String inputId = JOptionPane.showInputDialog(null, "This program calculates the total cost of a CD order\n" + "Please enter the ID of the CD:", "Input", JOptionPane.QUESTION_MESSAGE);
        String inputCd = JOptionPane.showInputDialog(null, "Please enter the title of the CD:", "Input", JOptionPane.QUESTION_MESSAGE);
        String inputPrice = JOptionPane.showInputDialog(null, "Please enter the price of the CD in U.S. dollars:", "Input", JOptionPane.QUESTION_MESSAGE);
        String inputPurchased = JOptionPane.showInputDialog(null, "Please enter the quantity to be purchased:", "Input", JOptionPane.QUESTION_MESSAGE);

        Double Price = Double.parseDouble(inputPrice);
        int Purchased = Integer.parseInt(inputPurchased);

        Double Subtotal = Price * Purchased;
        Double Tax = 0.0625;
        Double totalTax = Subtotal * (1 + Tax);

        String output = String.format(
            "Summary of the transaction:\n" +
            "CD ID: %s\n" +
            "CD Title: %s\n" +
            "CD Unit Price: $%.2f\n" +
            "CD Quantity: %d\n\n" +
            "Subtotal: $%.2f\n" +
            "Tax rate: 6.25%%\n" +
            "Total: $%.5f\n\n" +
            "End of Program",
            inputId, inputCd, Price, Purchased, Subtotal, totalTax
        );

        
        JOptionPane.showMessageDialog(null, output,"Message", JOptionPane.INFORMATION_MESSAGE);


	}

}
