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
        System.out.println("a to int: "+toInt('a'));
        System.out.println("b to int: "+toInt('b'));
        System.out.println("c to int: "+toInt('c'));
        System.out.println("0 to int: "+toInt('0'));
        System.out.println("1 to int: "+toInt('1'));
        System.out.println("2 to int: "+toInt('2'));
        System.out.println("$ to int: "+toInt('$'));
        System.out.println("* to int: "+toInt('*'));
        System.out.println("+ to int: "+toInt('+'));
        System.out.println("/ to int: "+toInt('/'));
    }
}
