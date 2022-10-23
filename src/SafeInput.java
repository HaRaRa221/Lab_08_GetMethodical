import java.util.Scanner;

public class SafeInput {

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString (Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print(prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }
        while (retString.length() == 0);

        return retString;

    }

    /**
     *
     * @param pipe  a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that  is not zero length
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            // favorite number 1-10
            System.out.println(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear the newline form the buffer
                done = true;
            }
             else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            // favorite number 1-10
            System.out.println(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the newline form the buffer
                done = true;
            }
            else // don't have an double
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     *
     * @param pipe The Scanner instance to use for the console input
     * @param prompt A string that tells the user what to input
     * @param low The lower bound for the ranger of the valid values
     * @param high The upper bound for the ranger of valid values
     * @return an integer within the range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {

            System.out.println(prompt + "[" + low + " - " + high +"]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear the newline form the buffer
                if (retVal >= 1 && retVal <= 10) {
                    System.out.println("\nYou said your ret val is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your ret val is " + retVal + " but that is out of range [" + low + " - " + high +"]: ");
                }
            } else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     *
     * @param pipe The Scanner instance to use for the console input
     * @param prompt A string that tells the user what to input
     * @param low The lower bound for the ranger to the valid values
     * @param high The upper bound for the ranger of valud values
     * @return an integer within the range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {

            System.out.println(prompt + "[" + low + " - " + high +"]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the newline form the buffer
                if (retVal >= 1 && retVal <= 10) {
                    System.out.println("\nYou said your ret val is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your ret val is " + retVal + " but that is out of range [" + low + " - " + high +"]: ");
                }
            } else // don't have a double
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        } while (!done);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        Boolean retVal = false;
        boolean done = false;
        String inputYN = "";

        do {
            // favorite number 1-10
            System.out.println(prompt + ": ");
            inputYN = pipe.nextLine();
            if (inputYN.equalsIgnoreCase("Y"))
            {
                done = true;
                retVal = true;
            }
            else if(inputYN.equalsIgnoreCase("N"))
            {
                done = true;
                retVal = false;
            }
            else // don't have a zero length string
            {
                System.out.println("You must enter Y or N");
            }
        } while (!done);

        return retVal;
    }


    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;

        do {
            // favorite number 1-10
            System.out.println(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("You must enter a string that matches the pattern " + regEx);
            }

        } while (!done);

        return retVal;
    }

}


