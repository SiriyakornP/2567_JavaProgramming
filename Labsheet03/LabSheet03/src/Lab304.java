import java.util.Scanner;
public class Lab304 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Full Name: ");
        String fullName = sc.nextLine().trim();

        int spaceIndex = fullName.indexOf(" ");
        if (spaceIndex == -1) 
        {
            System.out.println("Incorrect Name");
            return;
        }

        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1);

        boolean isFirstNameValid = false;
        if (firstName.length() > 0) 
        {
            char firstChar = firstName.charAt(0);
            String rest = firstName.substring(1);
            if (Character.isUpperCase(firstChar) && rest.equals(rest.toLowerCase())) 
            {
                isFirstNameValid = true;
            }
        }

        boolean isLastNameValid = lastName.equals(lastName.toLowerCase());

        if (isFirstNameValid && isLastNameValid) {
            System.out.println("First Name: " + firstName.toUpperCase());
            System.out.println("Last Name: " + lastName.toLowerCase());
        } 
        else 
        {
            System.out.println("Incorrect Name");
        }
        sc.close();
    }
}