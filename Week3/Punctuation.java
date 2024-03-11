// 4) Punctuation Marks

// Design and implement a program that counts the number of punctuation marks in the following string “Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. ”.
// Produce a table that shows how many times each symbol occurred.

import java.util.Scanner;
public class Punctuation
{
    public static void main(String args[])
    {
        String text;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the text:");
        text = scan.nextLine();
        
        char[] punctuationMarks = {'.', ',', '-', '!', '?'};

        int[] counts = new int[punctuationMarks.length];

           for (char ch : text.toCharArray()){

            for (int j = 0; j < punctuationMarks.length; j++) {
                if (ch == punctuationMarks[j]) {
                    counts[j]++;
                }
            }
        }

        System.out.println("Punctuation Marks Counts:");
        System.out.println("-------------------------");
        

        
        int index = 0;
        for (char mark : punctuationMarks) {
            System.out.println(mark + "\t\t\t" + counts[index++]);
        }
    }
}