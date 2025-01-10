import java.util.Scanner;

// making a class to print multiplication table of a number
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        int number = taking_input.nextInt();
        int[] multiplicationTable = new int[10];

        // Calculate multiplication table and store in array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display multiplication table
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
    }
}
