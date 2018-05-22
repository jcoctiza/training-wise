package main.bufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tri-Nvent on 5/22/2018.
 */
public class BufferedReaderDemo {

    public static final String FileName = "C:\\Users\\Tri-Nvent\\Desktop\\";

    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name from desktop: ");
        String fileName = input.nextLine();

        try{
                BufferedReader reader = new BufferedReader(new FileReader(FileName + fileName));
                String currentLine;
                System.out.println("\nInside the file " + fileName);
                System.out.println("------------------------------");
                while ((currentLine = reader.readLine()) != null) {
                    System.out.println(currentLine);
                }
                System.out.println("------------------------------");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
