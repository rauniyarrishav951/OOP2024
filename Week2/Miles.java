// ***3) Miles to Kilometers ***
// Write an application that converts miles to kilometers.(One mile equals 1.60935 km). Read the miles from the user as a floating point value.

import java.util.Scanner;
public class Miles
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Miles:");
        double miles = scan.nextDouble();

        // Convert Miles to kilometers
        double kilometers = miles * 1.60935;

        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}



  