import java.util.Scanner;

public class TypeConversionExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int number = input.nextInt();

        double convertedNumber = number;

        System.out.println("Converted to double: " + convertedNumber);
    }
}