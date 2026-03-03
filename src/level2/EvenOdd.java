import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        boolean isEven = num % 2 == 0;

        if (isEven) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}