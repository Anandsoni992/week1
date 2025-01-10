import java.util.Scanner;
//making a class for calculating the sum until user enters zero 

class SumUntilZeroUsingWhile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0; // Initialize total

        // Taking input from user and continuing the process until 0 is entered
        while (true) {
            System.out.print("Enter a Number (Enter 0 to stop) - ");
            int userInput = input.nextInt();
            if (userInput == 0) {
                break; // Exit the loop if input is 0
            }
            total += userInput; // Add input to total
        }

        System.out.println("The total sum is: " + total);
        input.close();
    }
}
