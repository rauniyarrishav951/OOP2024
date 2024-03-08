// 4) Square Calculations
// Write an application that prompts for and reads integer representing the length of a square’s side, then prints the square’s perimeter and area.

import java.util.Scanner;
public class Square
{
    public static void main(String args[])
    {
         Scanner scan = new Scanner(System.in) ;
         System.out.println("Enter the length:");
         int length= scan.nextInt();


         int perimeter = 4 * length;
         int area = length * length;

         System.out.println("The Perimeter is:"+ perimeter);
         System.out.println("The Area is:"+ area);


    }
}