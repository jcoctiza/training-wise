package main.mathsWithJava;

import java.util.Scanner;

public class ExponentialAndLogarithmicMethodDemo {
    public static void main(String args[]){
        System.out.println("Please Select a Method:");
        System.out.println("[1] exp()");
        System.out.println("[2] log()");
        System.out.println("[3] pow()");
        System.out.println("[4] sqrt()");
        System.out.print("\nMethod: ");
        Scanner input = new Scanner(System.in);
        switch(input.nextInt()){
            case 1:
                System.out.println("You have selected Exp method");
                System.out.print("Input a decimal number:  ");
                Scanner expInput = new Scanner(System.in);
                double expNum = expInput.nextDouble();
                System.out.println("exp("+expNum+") = "+Math.exp(expNum));
                break;

            case 2:
                System.out.println("You have selected Log method");
                System.out.print("Input a decimal number:  ");
                Scanner logInput = new Scanner(System.in);
                double logNum = logInput.nextDouble();
                System.out.println("log("+logNum+") = "+Math.log(logNum));
                break;

            case 3:
                System.out.println("You have selected Pow method");
                Scanner powInput = new Scanner(System.in);
                System.out.print("Input a Number:  ");
                int powNum1 = powInput.nextInt();
                System.out.print("Input an Exponent:  ");
                int powNum2 = powInput.nextInt();
                System.out.println(powNum1+" raised to the power of "+powNum2+" = "+Math.pow(powNum1,powNum2));
                break;

            case 4:
                System.out.println("You have selected Log method");
                System.out.print("Input a number:  ");
                Scanner sqrtInput = new Scanner(System.in);
                int sqrtNum = sqrtInput.nextInt();
                System.out.println("The square root of "+sqrtNum+" = "+Math.sqrt(sqrtNum));
                break;

            default:
                System.out.println("Please read the instruction and try again!");
                break;
        }
    }
}
