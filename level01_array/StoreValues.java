import java.util.Scanner;

// make a class to store multiple values and calculate the sum
public class StoreValues {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Take input until 0 or negative number or 10 values are reached
        while (true) {
            double num = taking_input.nextDouble();
            if (num <= 0 || index == 10) break;
            numbers[index++] = num;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display total
        System.out.println("Total sum: " + total);
    }
}
