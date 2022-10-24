import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuChoice;

        String sSN = SafeInput.getRegExString(in, "Enter your social security number", "\\d{3}-\\d{2}-\\d{4}");
        String ucStudent = SafeInput.getRegExString(in, "Enter your UC student id number", "(M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in, "What is the menu choice you want to display", "[OoSsVvQq]");
    }

}
