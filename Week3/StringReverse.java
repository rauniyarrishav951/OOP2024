// 3) String Reverser

// Write a small program that prompts the user for a sentence and then outputs the same sentence with the characters in each word reversed. 
// For example, if the user enters “This is a sample sentence.” then the output would be “sihT si a elpmas .ecnetnes.” 
// Note the use of multiple Scanner objects may be helpful with this program.

import java.util.Scanner;
public class StringReverse
{
    public static void main(String args[])
    {
        String Sentence;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        Sentence = scan.nextLine();

        StringBuilder reversedSentence = new StringBuilder();
        for (String word : Sentence.split(" "))
            reversedSentence.append(new StringBuilder(word).reverse()).append(" ");

        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());

    }
}