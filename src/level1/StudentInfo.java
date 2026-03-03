import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        // Creating scanner object
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter marks: ");
        double marks = input.nextDouble();

        // Display output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
