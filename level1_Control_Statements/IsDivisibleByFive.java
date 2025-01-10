import java.util.Scanner;
// making class for checking divisibility of five 
class IsDivisibleByFive {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number - ");
		int Num1 = input.nextInt();
		boolean isDivisibleByFive;
		
        // Checking if the number is divisible by 5
        if (Num1 % 5 == 0) {
            isDivisibleByFive = true;
        } else {
            isDivisibleByFive = false;
        }
		
		System.out.println("Is the number " + Num1 + " divisible by 5? " + isDivisibleByFive);
		input.close();
    }
}
