// 1) Table of Student Grades
// Write a Java program that prints a table with a list of at least 5 students together with their grades earned (lab points, bonus points, and the total) in the format below.

public class Table
{
    public static void main(String args[])
    {
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t\tStudent Points\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");


        
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
    
    String[][] students = {
            {"Joe", "43", "7"},
            {"William", "50", "8"},
            {"Mary Sue", "39", "10"},
            {"Rishav", "45", "6"},
            {"Aarnav", "48", "9"}
        };
        for (String[] student : students) {
            String name = student[0];
            int lab = Integer.parseInt(student[1]);
            int bonus = Integer.parseInt(student[2]);
            int total = lab + bonus;

            System.out.println(name + "\t\t" + lab + "\t" + bonus + "\t" + total);
        }
    }
}