import java.util.Scanner;
// making a class for doing coutdown using while loop 

class CountdownUsingWhile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the countdown start value from user
        System.out.print("Enter the starting value for countdown - ");
        int counter = input.nextInt();

        // Countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrementing the counter
        }

        input.close();
    }
}
