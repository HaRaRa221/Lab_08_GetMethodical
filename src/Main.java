import java.util.Scanner;

public class Main {
    public static void GetUserName(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
    public static void FavNumbers(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter your fav int");
        favDouble = SafeInput.getDouble(in, "Enter your fav double");
        System.out.println("Your favorite int and double is: " + favInt + " and " + favDouble);
    }


}
