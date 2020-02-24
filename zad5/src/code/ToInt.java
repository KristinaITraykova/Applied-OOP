package code;

import java.util.Scanner;

public class ToInt {

    public static int toInt(char symbol) {
        return (int)symbol;
    }
    public static void main(String[] args) {
	// write your code here

        System.out.println("A to int: "+toInt('A'));
        System.out.println("B to int: "+toInt('B'));
        System.out.println("C to int: "+toInt('C'));
        
    }
}
