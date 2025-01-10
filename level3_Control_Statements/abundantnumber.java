import java.util.Scanner;

// creating a class for the abundant number 

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Get the number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int sum = 0;

        // Loop through all possible divisors
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        input.close();
    }
}
