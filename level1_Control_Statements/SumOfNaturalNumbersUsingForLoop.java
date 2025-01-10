import java.util.Scanner;
// making a class for sum of natural numbers using for loop 

public class SumOfNaturalNumbersUsingForLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Take user input
        System.out.print("Enter a natural number: ");
        int upperLimit = input.nextInt();

        // Check if the input is a natural number
        if (upperLimit <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Compute the sum using a for loop
            int sumUsingFor = 0;
            for (int i = 1; i <= upperLimit; i++) {
                sumUsingFor += i;
            }

            // Computing the sum using the formula
            int sumUsingFormula = upperLimit * (upperLimit + 1) / 2;

            System.out.println("Sum using for loop: " + sumUsingFor);
            System.out.println("Sum using formula: " + sumUsingFormula);

            // Comparing the results
            if (sumUsingFor == sumUsingFormula) {
                System.out.println("Both computations are correct and produce the same result");
            } else {
                System.out.println("Results are different");
            }
        }

        input.close();
    }
}
