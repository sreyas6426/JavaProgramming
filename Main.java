import java.util.Scanner;

class Student {
    String name;
    int age;
    int rollNo;
    int marks;

    void input() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = in.nextLine();

        System.out.print("Enter Age: ");
        age = in.nextInt();

        System.out.print("Enter Roll No: ");
        rollNo = in.nextInt();

        System.out.print("Enter Marks: ");
        marks = in.nextInt();
    }

    void display() {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Student obj = new Student();

        obj.input();
        obj.display();
    }
}