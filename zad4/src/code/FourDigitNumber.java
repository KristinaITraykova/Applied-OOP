package code;

import java.util.Scanner;

public class FourDigitNumber {

    public static void main(String[] args) {
	// write your code here
        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 digit number: ");
        number = input.nextInt();

        int originNum = number;
        if(!(number >= 1000 && number <= 9999)){
            System.out.println("The number is not 4 digit.");
        }

        while(number != 0) {
            int remind = number % 4;
            number /= 4;

            switch (remind) {
                case 0: {
                    System.out.println('A');
                    break;
                }
                case 1: {
                    System.out.println('C');
                    break;
                }
                case 2: {
                    System.out.println('G');
                    break;
                }
                case 3: {
                    System.out.println('T');
                    break;
                }
                default: {
                    System.out.println("Something went wrong.");
                }
            }
        }
    }
}
