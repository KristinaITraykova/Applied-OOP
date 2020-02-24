package code;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 digit number: ");
        number = input.nextInt();

        int originalNumber = number;
        int digit1, digit2, digit3,digit4,digit5;
        String resultString;

        if(!(number >= 10000 && number <= 99999 )){
            System.out.println("The number is not 5 digit.");
        }
        else{
            digit1 = number / 10000 % 10;
            digit2 = number / 1000 % 10;
            digit4 = number /10 % 10;
            digit5 = number % 10;

            if (digit1 == digit5 && digit2 == digit4)
            {
                resultString = "It is palindrome";
                System.out.println(resultString);
            }
            else {
                resultString = "It is not palindrome";
                System.out.println(resultString);
            }
        }

    }
}
