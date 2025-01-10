import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = taking_input.nextInt();

        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks in Physics, Chemistry, and Maths for student " + (i + 1) + ": ");
            marks[i][0] = taking_input.nextDouble(); // Physics
            marks[i][1] = taking_input.nextDouble(); // Chemistry
            marks[i][2] = taking_input.nextDouble(); // Maths
        }

        // Calculate percentages and grades
        for (int i = 0; i < n; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentages[i] >= 90) grades[i] = "A";
            else if (percentages[i] >= 75) grades[i] = "B";
            else if (percentages[i] >= 50) grades[i] = "C";
            else grades[i] = "D";
        }

        // Display results
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " -> Percentage: " + percentages[i] + ", Grade: " + grades[i]);
        }
    }
}
