import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int i = 1;

        System.out.print("Enter limit: ");
        int limit = input.nextInt();

        while (i <= limit) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}