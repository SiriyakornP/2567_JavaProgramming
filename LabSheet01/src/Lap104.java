import javax.swing.*;


public class Lap104 {

	public static void main(String[] args) {

	    JOptionPane.showMessageDialog(null, "Welcome to the payroll application", "Welcome", JOptionPane.INFORMATION_MESSAGE);

	    String inputName = JOptionPane.showInputDialog(null, "Enter employee name:", "Input", JOptionPane.QUESTION_MESSAGE);
	    String hourWorked = JOptionPane.showInputDialog(null, "Enter total hours for this employee:", "Input",    JOptionPane.QUESTION_MESSAGE);
	    String hourWage = JOptionPane.showInputDialog(null, "Enter hourly wage for this employee:", "Input", JOptionPane.QUESTION_MESSAGE);

	    Double totalWorked = Double.parseDouble(hourWorked);
	    Double totalWage = Double.parseDouble(hourWage);

	    Double totalPay = totalWorked * totalWage;
	    Double taxRate = 0.15;
	    Double taxAmount = totalPay * taxRate;
	    Double total = totalPay - taxAmount;

	    String resultMessage = String.format("Employee Name: %s\n" + 
	                                         "Hours worked: %.2f\n" + 
	                                         "Hourly wage: $%.2f\n" + 
	                                         "Gross earnings: $%.2f\n" + 
	                                         "Tax rate: %.2f\n" + 
	                                         "Tax: $%.2f\n" + 
	                                         "Net earnings: $%.2f", 
	                                         inputName, totalWorked, totalWage, totalPay, taxRate, taxAmount, total);

	    JOptionPane.showMessageDialog(null, resultMessage, "Messade", JOptionPane.INFORMATION_MESSAGE);
	}

}
