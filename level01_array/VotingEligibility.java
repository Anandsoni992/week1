import java.util.Scanner;

// making a class to check voting eligibility based on age
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        int[] ages = new int[10];

        // Taking input for the ages of the students
        for (int i = 0; i < ages.length; i++) {
            ages[i] = taking_input.nextInt();
        }

        // Check voting eligibility
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}
