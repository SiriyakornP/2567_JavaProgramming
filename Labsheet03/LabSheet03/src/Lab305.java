import java.util.*;
public class Lab305
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    String input ;

    System.out.print("Input some sentence : ");
    input = scan.nextLine();
    while(!(input.endsWith(".")))
    {
      System.out.print("The sentence must end with full stop point : ");
      input = scan.nextLine();
    }
    System.out.println();
    for(int i = 0; i < input.length(); i++)
      {
        char c = input.charAt(i);
        if(c == ' ')
        {
          System.out.println();
        }
        else
        {
        	System.out.print(c);
        }
      }
    scan.close();
  }
  
}