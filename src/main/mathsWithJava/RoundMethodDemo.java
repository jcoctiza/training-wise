package main.mathsWithJava;

import java.util.Scanner;

public class RoundMethodDemo {
    public static void main(String args[]){
        System.out.println("Input a decimal number:");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        System.out.print("Round off for "+number+" is "+Math.round(number));
    }
}
