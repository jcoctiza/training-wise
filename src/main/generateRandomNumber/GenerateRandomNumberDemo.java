package main.generateRandomNumber;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Tri-Nvent on 5/17/2018.
 */
public class GenerateRandomNumberDemo {
    public static void main(String args[]){
        System.out.println("Welcome to Simple Lotto Draw");
        System.out.println("Please Select Draw Type and press Enter to generate random numbers: ");
        System.out.println("[1] EZ 2 Lotto");
        System.out.println("[2] Swertres Lotto");
        System.out.println("[3] 6/45");
        System.out.println("[4] 6/55");
        System.out.print("\nDraw Type: ");
        Scanner input = new Scanner(System.in);
        int drawType = input.nextInt();
        switch (drawType){
            case 1:
                Random random1 = new Random();
                System.out.println("\nWinning numbers for EZ 2 Lotto:");
                for(int random = 0; random <2 ; random++){
                    int num1 = random1.nextInt(9);
                    System.out.print(num1+" ");
                }
                break;

            case 2:
                Random random2 = new Random();
                System.out.println("\nWinning numbers for Swertres Lotto:");
                for(int random = 0; random <3 ; random++){
                    int num2 = random2.nextInt(9);
                    System.out.print(num2+" ");
                }
                break;

            case 3:
                Random random3 = new Random();
                System.out.println("\nWinning numbers for 6/45 Lotto:");
                for(int random = 0; random <6 ; random++){
                    int num3 = random3.nextInt(45);
                    System.out.print(num3+" ");
                }
                break;

            case 4:
                Random random4 = new Random();
                System.out.println("\nWinning numbers for 6/55 Lotto:");
                for(int random = 0; random <6 ; random++){
                    int num4 = random4.nextInt(55);
                    System.out.print(num4+" ");
                }
                break;

            default:
                System.out.println("Please select a valid Draw Type from the table above!");
                break;
        }
        System.out.print("\n");
    }
}
