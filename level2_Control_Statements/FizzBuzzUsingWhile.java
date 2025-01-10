// Importing Scanner class from util pkg for taking input 
import java.util.Scanner;

//making a class for fizzbuzz using while loop 

class FizzBuzzUsingWhile{
    public static void main(String[] args) {
		
        Scanner input  = new Scanner(System.in);

        // taking a required number as input 
        System.out.print("Enter a number to generate FizzBuzz - ");
        int number = input.nextInt();
		
		//Check if number is less than 0
		if(number<0){
			return;
		}
		
        // Generating FizzBuzz pattern
		int sequence=0;
        while(sequence<=number){
			//Check for the condition if number is divisible by 3 and 5
			if(sequence%3==0 && sequence%5==0){
				System.out.println("FizzBuzz");
			}
			//Check for the condition if number is divisible by 3 
			else if(sequence%3==0){
				System.out.println("Fizz");
			}
			//Check for the condition if number is divisible by 5
			else if(sequence%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(sequence);
			}
			sequence++;
		}	
        input.close();
    }
}