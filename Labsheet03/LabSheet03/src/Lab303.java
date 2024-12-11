import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a sentence : ");
		String inputSentence = scan.next();
		
		while(inputSentence.endsWith(".")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail,again : ");

		}
		
		if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail pr gmail dot com");
		}


	}

}
