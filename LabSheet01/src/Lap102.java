import java.util.*;

public class Lap102 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the number of minutes: ");
		int numMinutes = scan.nextInt();
		
		int minutesPerYear = 60*24*365;
		int minutesPerDay  = 60*24;
		
		int years = numMinutes/minutesPerYear;
		int remainingMinutes = numMinutes % minutesPerYear;
		int day   = remainingMinutes / minutesPerDay;
		
		System.out.println(numMinutes + " minutes is approximately" + years + " years and " + day + " day.");
		
		scan.close();


	}

}
