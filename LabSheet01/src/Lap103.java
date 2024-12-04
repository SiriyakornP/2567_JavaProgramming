import javax.swing.*;

public class Lap103 {

	public static void main(String[] args) 
	{
		 String input = JOptionPane.showInputDialog("Input Time Parking (minutes): ");
		    int totalMinutes = Integer.parseInt(input);

		    int hours = totalMinutes / 60;
		    int minutes = totalMinutes % 60;

		    double totalHrmn = (hours * 50) + (minutes * 0.25);

		    String message = String.format("You parking %d Hour %d Minute.\nAmount to be paid is %.2f baht.",hours, minutes, totalHrmn);

		    JOptionPane.showInputDialog(null, message);

	}

}
