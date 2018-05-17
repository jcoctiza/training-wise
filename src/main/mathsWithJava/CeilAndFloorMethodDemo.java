package main.mathsWithJava;

import java.util.Scanner;

public class CeilAndFloorMethodDemo {
    public static void main(String args[]){
        System.out.println("Input a decimal number:");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        System.out.println("Ceiling for "+ number +" is "+Math.ceil(number));
        System.out.println("Floor for "+ number +" is "+Math.floor(number));
    }
}
