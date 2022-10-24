import java.util.Scanner;

public class CheckOut
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);

       double checkPrice = 0;
       boolean moreItems = false;

       checkPrice = SafeInput.getRangedDouble(in, "Enter the price of item", .50, 9.99);

   }
}
