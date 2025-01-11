//importing Scanner class from util pkg 
import java.util.Scanner; 

// making a class for calculating simple interest 
class Simpleinterest{
public int simpleInterest(int Principal, int Rate, int Time){
int si = (Principal* Rate* Time)/100; 
return si; 
}
public static void main (String[] args){ 
// making input as an object of CSanner class 
Scanner input = new Scanner(System.in); 
System.out.println("Enter Principal:"); 
int principal = input.nextInt(); 
System.out.println("Enter Rate:"); 
int rate = input.nextInt(); 
System.out.println("Enter time:"); 
int time = input.nextInt(); 
Main obj = new Main(); 
int si = obj.simpleInterest(principal,rate,time); 

//Displaying simpleInterest 
System.out.println("the si is :"+si); 
}
}