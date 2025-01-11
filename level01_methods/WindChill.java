//importing Scanner class from util pkg 
import java.util.Scanner;

// Making a class for Wind Chill
public class WindChill {
    public static void main(String[] args) {

// making input as a object of Scanner class 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed = input.nextDouble();
        
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is: " + windChill);
    }

    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
