//importing Scanner class from util pkg 
import java.util.Scanner;

//creating a class for calculating maximum handshakes 
public class MaximumHandshakeswithoutmethod {
    public static void main(String[] args) {
// making input as an object of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = input.nextInt();
        
        int handshakes = (students * (student-1))/2;
        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}
