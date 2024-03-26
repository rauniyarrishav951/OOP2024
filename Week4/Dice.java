// 2) Dice

// Write a program that simulates rolling two dice using the following steps:
// 1.Prompt the user for the number of sides for two dice.
// 2.“Roll” the dice three times by generating a random number between 1 (inclusive) and the number of sides (inclusive).
// 3.Keep track of the sum of the rolls for each die and output the sum and average for each die.

import java.util.Scanner;
import java.util.Random;
public class Dice
{
    public static void main(String[] args)
    {
        int sides1;
        int sides2;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();


       System.out.println("How many sides does die 1 have?: ");
       sides1 = scan.nextInt();
       System.out.println("How many sides does die 2 have?: ");
       sides2 = scan.nextInt();

         
        int roll1 = random.nextInt(sides1) + 1;
        int roll2 = random.nextInt(sides2) + 1;

        System.out.println("Die 1 rolled a total of " + roll1);
        System.out.println("Die 2 rolled a total of " + roll2);

        double average1 = roll1;
        double average2 = roll2;

        System.out.println("Die 1 rolled an average of " + average1);
        System.out.println("Die 2 rolled an average of " + average2);

            

        
    }
}
       
    
