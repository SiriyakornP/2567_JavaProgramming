import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName;
		String firstName;
		
		System.out.print("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' '); //หาช่องว่าง
		firstName = fullName.substring(0,space);		
		//System.out.println(firstName);
		
		//middle name
		System.out.println(abbreviatName(fullName)+firstName);
		
		input.close();
	}//end main()

	
	public static String abbreviatName(String fName) {
		String initialLetter="";
		
		for(int i=0;i<fName.length();i++) {
			if(fName.charAt(i) == ' ') {
				initialLetter = (initialLetter+fName.charAt(i+1)).toUpperCase();
				initialLetter = initialLetter+".";
			}
		}//end for
		return initialLetter;
		
	}
}
