import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        float m1, m2, m3, total, average;

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter marks in 3 subjects: ");
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();
        m3 = sc.nextFloat();

        total = m1 + m2 + m3;
        average = total / 3;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result: Pass");

            if (average >= 75)
                System.out.println("Distinction: Yes");
            else
                System.out.println("Distinction: No");

            if (average >= 90)
                System.out.println("Special Award: Yes");
            else
                System.out.println("Special Award: No");
        } else {
            System.out.println("Result: Fail");
            System.out.println("Distinction: No");
            System.out.println("Special Award: No");
        }
    }
}