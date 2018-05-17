package main.mathsWithJava;

import java.util.Scanner;

public class MinAndMaxMethodDemo {
    public static void main(String args[]){
        System.out.println("Type 1 for Int input || Type 2 for Double input");
        Scanner input = new Scanner(System.in);

        switch(input.nextInt()){
            case 1:
                Scanner intInput = new Scanner(System.in);
                System.out.print("Int 1: ");
                int intNum1 = intInput.nextInt();
                System.out.print("Int 2: ");
                int intNum2 = intInput.nextInt();
                System.out.println("Minimum out of "+intNum1+" and "+intNum2+" is "+Math.min(intNum1,intNum2));
                System.out.println("Maximum out of "+intNum1+" and "+intNum2+" is "+Math.max(intNum1,intNum2));
                break;

            case 2:
                Scanner doubleInput = new Scanner(System.in);
                System.out.print("Double 1: ");
                double doubleNum1 = doubleInput.nextDouble();
                System.out.print("Double 2: ");
                double doubleNum2 = doubleInput.nextDouble();
                System.out.println("Minimum out of "+doubleNum1+" and "+doubleNum2+" is "+Math.min(doubleNum1,doubleNum2));
                System.out.println("Maximum out of "+doubleNum1+" and "+doubleNum2+" is "+Math.max(doubleNum1,doubleNum2));
                break;

            default:
                System.out.println("Please read the instruction!");
                break;
        }
    }
}
