// 5) Fraction 
// Write an application that prompts and reads the numerator and denominator of a fraction as integers and then prints the decimal equivalent of the fraction.

import java.util.Scanner;
public class Fraction
{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Numerator:");
        int Numerator = scan.nextInt();
        System.out.println("Enter Denominator:");
        int Denominator = scan.nextInt();

        double decimalEquivalent = (double) Numerator / Denominator;

        System.out.println("DecimalEquivalent:"+decimalEquivalent);

    }
}