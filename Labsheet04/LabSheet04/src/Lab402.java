import java.util.Scanner;

import javax.swing.*;
public class Lab402 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		checkYear();
		isLeapYear();
		
		JOptionPane.showInputDialog("Input Year: ");
		int year = input.nextInt();
		
	}//end main()
	
	public static boolean checkYear(int year) {
		if((year%4==0 && year%100!=0) || year%400==0) {
			JOptionPane.showMessageDialog(null, year+"is a Leap year.");
		} else {
			JOptionPane.showMessageDialog(null, year+"is NOT Leap year.");
		}
	}//end checkYear()
	
	public static boolean isLeapYear() {
		
	}//end isLeapYear()

}
