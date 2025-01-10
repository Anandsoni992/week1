import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + names[i] + ": ");
            ages[i] = taking_input.nextInt();
            heights[i] = taking_input.nextDouble();
        }

        // Determine youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        // Output results
        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }
}
