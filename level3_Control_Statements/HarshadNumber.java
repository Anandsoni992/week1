import java.util.Scanner;

//creating a class for checking the harshhad number 
public class HarshadNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number; // Keep the original number for comparison
        int sum = 0;

        // Calculate the sum of digits
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;            // Add the digit to sum
            number /= 10;            // Remove the last digit
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        input.close();
    }
}
