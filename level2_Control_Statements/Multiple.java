//importing Scanner class from util pkg to take input
import java.util.Scanner;

// making a class to print all the multiple of a number 
public class Multiple {
    	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get the input value
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Multiples of " + number + " below 100 are:");
        
        // Loop to find multiples, running backward
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
