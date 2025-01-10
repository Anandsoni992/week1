import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salaries and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ": ");
            double s = taking_input.nextDouble();
            double y = taking_input.nextDouble();
            if (s < 0 || y < 0) {
                i--; // Invalid input, retry
                continue;
            }
            salary[i] = s;
            yearsOfService[i] = y;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            bonus[i] = (yearsOfService[i] > 5 ? 0.05 : 0.02) * salary[i];
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output results
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
