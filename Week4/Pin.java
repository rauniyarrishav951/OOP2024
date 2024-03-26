// 4) Pin Encryption

// Write a block of source code to encrypt a four digit pin number by doing the following:

// 1. Convert the pin number to hexadecimal.
// 2. Generate two random numbers greater than 1000 and less than 65536 and convert them to hexadecimal.
// 3. Sandwich the converted pin between the two random hexadecimal numbers.

import java.util.Scanner;
import java.util.Random;

public class Pin
{
    public static void main(String args[])
    {
        int pin;

        Scanner scan = new Scanner(System.in);

        System.out.print ("Enter a 4 digit pin number to encrypt: ");
        pin = scan.nextInt();

        if (pin < 1000 || pin > 9999) {
            System.out.println("Invalid pin number. Please enter a 4 digit pin.");
            return;
        }
        
        String encryptedPin = encryptPin(pin);
        System.out.println("Your encrypted pin number is " + encryptedPin);
    }

    public static String encryptPin(int pin) {
        Random random = new Random();
        int random1 = random.nextInt(9000) + 1000;
        int random2 = random.nextInt(9000) + 1000;

        return String.format("%04x%04x%04x", random1, pin, random2);
    }
}



    
