package main.splitString;

import java.util.Scanner;

/**
 * Created by Tri-Nvent on 5/21/2018.
 */
public class SplitStringDemo {

    public static void main(String[] args){
        SplitStringDemo object = new SplitStringDemo();
        String name = "James-Carlo-Balanay-Octiza";
        
        if(name.contains(",") == true){
            String[] arrName = name.split(",");
            object.array(arrName);
        }
        else if(name.contains("-") == true){
            String[] arrName = name.split("-");
            object.array(arrName);
        }
        else if(name.contains(" ") == true){
            String[] arrName = name.split("\\s");
            object.array(arrName);
        }
    }
    public void array(String[] arrName){
        for (int i = 0; i < arrName.length; i++){
            System.out.println(arrName[i]);
        }
    }

}


