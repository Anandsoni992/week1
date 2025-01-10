import java.util.Scanner;

// making a class to calculate the mean height of players in a football team
public class MeanHeight {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        // Taking input for the heights of 11 players
        for (int i = 0; i < heights.length; i++) {
            heights[i] = taking_input.nextDouble();
            sum += heights[i];
        }

        // Calculate and display mean height
        double mean = sum / heights.length;
        System.out.println("Mean height: " + mean);
    }
}
