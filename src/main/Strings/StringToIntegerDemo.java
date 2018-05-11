package main.Strings;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class StringToIntegerDemo {
    public static void main(String[] args){
        String num1 = "100";
//        int convertedNum = Integer.parseInt(num1);
        int convertedNum = Integer.valueOf(num1);
        System.out.println("String "+num1+" was Converted into Int");
        System.out.println("Output using Arithmetic operation + :" + (convertedNum + convertedNum));
    }
}