import java.util.Scanner;

// making a class copy a 2D array to a 1D array
public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        int rows = taking_input.nextInt();
        int cols = taking_input.nextInt();
        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;

        // Take input for 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = taking_input.nextInt();
            }
        }

        // Copy 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.println("1D array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
