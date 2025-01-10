import java.util.Scanner;

class EmployeeBonucalc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking as input Employee's salaryOfEmployee and years of service
        System.out.print("Enter the employee's salaryOfEmployee - ");
        double salaryOfEmployee = input.nextDouble();

        System.out.print("Enter the employee's years of service -  ");
        int serviceYears = input.nextInt();

        // Check if the employee is eligible for the bonus
        if (serviceYears > 5) {
            // Calculating bonus
            double bonus = salaryOfEmployee * 5 / 100;
            System.out.println("Bonus amount is INR " + bonus);
        } else {
            System.out.println("Employee is not eligible for bonus");
        }

        input.close();
    }
}
