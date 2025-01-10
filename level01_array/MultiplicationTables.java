import java.util.Scanner;

// making a class to print multiplication tables of numbers from 6 to 9
public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        int number = taking_input.nextInt();
        int[] multiplicationResult = new int[4];

        // Calculate multiplication tables for 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display results
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}
