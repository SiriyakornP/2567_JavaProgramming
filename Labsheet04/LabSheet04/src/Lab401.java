import javax.swing.*;
public class Lab401 {

	//main()
	public static void main(String[] args) {
		
		inputEmail();
		//end of main()
		
	}
	
	public static void inputEmail() {		
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail : ");
			if(varEmail!=null && !varEmail.isEmpty()) {
				checkEmailError(varEmail);
			} else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!!!");
			}
			
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y] : ");
			
		} while (ans!=null && ans.equalsIgnoreCase("y"));
	}//end of inputEmail()
	
	public static void checkEmailError(String email) {
		while(email.startsWith("0") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail again : ");	
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)
				?"Your e-mail is "+email //return true
				:"Your e-mail is not a hotmail or gmail address."
		);
		
	}//end of checkEmailError()

	
	public static boolean checkEmail(String email) {
		/*if(email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
			return true;
		} else {
			return false;
		}*/
		
		/*if(email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
			return true;
		}
		return false;*/
		
		return (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com"));
		
	}//end of checkEmail()
}
