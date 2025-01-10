import java.util.Scanner;

// making a class to find the factors of a number and store them in an array
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        int number = taking_input.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number and store in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Display factors
        System.out.println("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
