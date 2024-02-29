// 4. Write and application that prints the following diamond shape. Don’t print any unneeded characters
public class Diamond
{
    public static void main(String args[])
    {
        int a=4;

        for(int i=0; i<a;i++){

            for(int j=0; j<a-i-1;j++)
        
        {
            System.out.println(" ");
        }
        for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}