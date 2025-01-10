import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = taking_input.nextInt();
        int count = 0, temp = number;

        // Count the digits in the number
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;

        // Store digits in array
        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display digits in reverse order
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
