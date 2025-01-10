import java.util.Scanner;
//making class to check if the number is positive, negative, or zero and compare first and last elements

public class NumberCheck {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = taking_input.nextInt();
        }

        // Check if numbers are positive, negative, or zero
        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num + " is positive and " + (num % 2 == 0 ? "even" : "odd"));
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }

        // Compare first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("Last element is greater");
        } else {
            System.out.println("First and last elements are equal");
        }
    }
}
