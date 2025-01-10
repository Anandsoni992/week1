import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = taking_input.nextInt();
        int[] frequency = new int[10];

        // Count the frequency of digits
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display digit frequencies
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}
