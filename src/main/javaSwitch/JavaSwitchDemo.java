package main.javaSwitch;

import java.util.Scanner;

/**
 * Created by Tri-Nvent on 5/16/2018.
 */
public class JavaSwitchDemo {
    public static void main(String[] args){

        Scanner month = new Scanner(System.in);
        System.out.print("Input Month Number: ");

        switch(month.nextInt()){
            case 1:
                System.out.print("You have Selected: ");
                System.out.println("January");
                break;

            case 2:
                System.out.print("You have Selected: ");
                System.out.println("February");
                break;

            case 3:
                System.out.print("You have Selected: ");
                System.out.println("March");
                break;


            case 4:
                System.out.print("You have Selected: ");
                System.out.println("April");
                break;

            case 5:
                System.out.print("You have Selected: ");
                System.out.println("May");
                break;

            case 6:
                System.out.print("You have Selected: ");
                System.out.println("June");
                break;

            case 7:
                System.out.print("You have Selected: ");
                System.out.println("July");
                break;

            case 8:
                System.out.print("You have Selected: ");
                System.out.println("August");
                break;

            case 9:
                System.out.print("You have Selected: ");
                System.out.println("September");
                break;

            case 10:
                System.out.print("You have Selected: ");
                System.out.println("October");
                break;

            case 11:
                System.out.print("You have Selected: ");
                System.out.println("November");
                break;

            case 12:
                System.out.print("You have Selected: ");
                System.out.println("December");
                break;

            default:
                System.out.print("You have Selected: ");
                System.out.println("Cannot Find Month!");
                break;

        }
    }
}
