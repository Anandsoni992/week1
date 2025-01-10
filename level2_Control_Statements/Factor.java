//importing Scanner class from util pkg to take input
import java.util.Scanner;

//making a class to print all the factors of a particular number 

public class Factor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get the input value
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Factors of " + number + " are:");
        
        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        
        
        sc.close();
    }
}
