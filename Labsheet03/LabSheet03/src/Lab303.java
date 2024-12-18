import java.util.Scanner;

public class Lab303 
{
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
		String sentence ;
		
		System.out.print("Input a sentence : ");
		sentence = scan.nextLine();
		while(!(sentence.endsWith(".")))
		{
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
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

        System.out.println("\nThis sentence has " + spaceCount + " spacebar.");
        System.out.println("This sentence has " + wordCount + " word.");
        scan.close();
    }
}
