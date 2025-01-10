import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int n = taking_input.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("Enter height (in meters) and weight (in kg) for person " + (i + 1) + ": ");
            heights[i] = taking_input.nextDouble();
            weights[i] = taking_input.nextDouble();
        }

        // Calculate BMI and weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal weight";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obesity";
        }

        // Display results
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + heights[i] + ", Weight: " + weights[i] + ", BMI: " + bmi[i] + ", Status: " + status[i]);
        }
    }
}
