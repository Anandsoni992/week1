//importing Scanner class from util pkg to take input
import java.util.Scanner;

//making class for calculating Power of number 
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initializing result variable
        int result = 1;

        // Calculating the power using a loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Displaying the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        input.close();
    }
}
