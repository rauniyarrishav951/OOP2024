 // *******************************************************************
// Average.java
//
// Read three integers from the user and print their average
// *******************************************************************
// 2) Computing Averages The following program reads three integers and prints the average. Fill in the blanks so that it will work correctly.

import java.util.Scanner;
public class Average
{
    public static void main(String args[])
    {

       int val1, val2, val3;
       double average;
       Scanner scan = new Scanner(System.in) ;


       // get three values from user
       System.out.println("Please enter three integers and " +
                       "I will compute their average");


        System.out.println("Enter first value:");
        val1=scan.nextInt();
        System.out.println("Enter Second value:");
        val2=scan.nextInt();
        System.out.println("Enter third value:");
        val3=scan.nextInt();
        

        //compute the average
        average = (val1 + val2 + val3) / 3.0;

        //print the average
        System.out.println("The average is" + average+".");


    }
}
