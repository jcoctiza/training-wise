package main.mathsWithJava;

import java.util.Scanner;

public class AbsMethodDemo {
    public static void main(String args[]){
        System.out.println("Type 1 for Int input || Type 2 for Double input");
        Scanner input = new Scanner(System.in);

        switch(input.nextInt()){
            case 1:
                Scanner intInput = new Scanner(System.in);
                System.out.println("Int: ");
                System.out.println("Absolute value: " +Math.abs(intInput.nextInt()));
                break;

            case 2:
                Scanner doubleInput = new Scanner(System.in);
                System.out.println("Double: ");
                System.out.println("Absolute value: " +Math.abs(doubleInput.nextDouble()));
                break;

            default:
                System.out.println("Please read the instruction!");
                break;
        }
    }
}
