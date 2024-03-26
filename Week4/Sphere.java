// 5) Sphere Calculations

// Write and application that reads the radius of a sphere and prints its volume and surface area.
// Use the following formulas, where r represents the radius of the sphere. Print the output to four decimal places.

// Volume = 4πr3 / 3
// Surface area = 4πr2

import java.util.Scanner;
public class Sphere
{
    public static void main(String[] args)
    {
        double r;
        double volume,area;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius:");
        r = scan.nextDouble();

        volume = (4 * Math.PI * Math.pow(r, 3)) / 3;
        area = 4 * Math.PI * Math.pow(r, 2);

        System.out.printf("Volume of the sphere: %.4f\n", volume);
        System.out.printf("Surface area of the sphere: %.4f\n", area);

    }
}