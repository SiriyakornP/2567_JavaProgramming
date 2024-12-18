import javax.swing.*;
import java.util.*;
public class Lab303_1 {

	 public static void main(String[] args) 
	    {
	    	Scanner scan = new Scanner(System.in);
			String sentence ;
			
			sentence = JOptionPane.showInputDialog(null, "Input a sentence : ", "Input", JOptionPane.QUESTION_MESSAGE);
			while(!(sentence.endsWith(".")))
			{
				sentence = JOptionPane.showInputDialog(null, "Input a sentence, again : ", "Input", JOptionPane.QUESTION_MESSAGE);
			}
	        int spaceCount = 0;
	        int wordCount = 0;
	        boolean inWord = false;

	        for (int i = 0; i < sentence.length(); i++) 
	        {
	            char c = sentence.charAt(i);

	            if (c == ' ') 
	            {
	                spaceCount++;
	            }

	            if (c != ' ' && c != '.') 
	            {
	                if (!inWord) 
	                {
	                    wordCount++;
	                    inWord = true;
	                }
	            } 
	            else 
	            {
	                inWord = false;
	            }
	        }
	        JOptionPane.showMessageDialog(null, 
	                "This sentence has " + spaceCount + " space\n" + 
	                "This sentence has " + wordCount + " word.", 
	                "Result", JOptionPane.INFORMATION_MESSAGE);
	    }
	}
