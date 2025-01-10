import java.util.Scanner;

// making a class for FizzBuzz
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        int number = taking_input.nextInt();
        String[] results = new String[number + 1];

        // Loop for FizzBuzz logic
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
