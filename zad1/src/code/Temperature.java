package code;

import java.util.Scanner;

public class Temperature {

    public static double toFahrenheit(double temperature){
        return 9.0 / 5.0 * temperature + 32;
    }
    public static double toCelsius(double temperature){
        return 5.0/9.0 * (temperature - 32);
    }

    public static void main(String[] args) {
	// write your code here

        double temperature;
        Scanner input = new Scanner(System.in); // cin

        System.out.print("Enter temperature: ");
        temperature = input.nextDouble();  // >>temperature

        System.out.print("Enter 1 to know your temperature in Fahrenheit or 2 - for Celsius: ");
        int choice = input.nextInt();
        switch(choice) {
            case 1: {
                System.out.println(toFahrenheit(temperature));
                break;
            }
            case 2: {
                System.out.println(toCelsius(temperature));
                break;
            }
            default:{
                System.out.println("Error. Enter 1 or 2.");
            }
        }
    }
}
