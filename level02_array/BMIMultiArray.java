import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int n = taking_input.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("Enter height (in meters) and weight (in kg) for person " + (i + 1) + ": ");
            personData[i][0] = taking_input.nextDouble(); // Height
            personData[i][1] = taking_input.nextDouble(); // Weight
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]); // BMI
            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 24.9) weightStatus[i] = "Normal weight";
            else if (personData[i][2] < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obesity";
        }

        // Display results
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + personData[i][0] + ", Weight: " + personData[i][1] + ", BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}
