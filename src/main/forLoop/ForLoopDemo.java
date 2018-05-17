package main.forLoop;

/**
 * Created by Tri-Nvent on 5/16/2018.
 */
public class ForLoopDemo {
    public static void main(String[] args){
        String dragon[] = {"Red Dragon", "Blue Dragon", "Black Dragon"};
        System.out.println("List of Dragons using forLoop:");
        for(String dragons: dragon){
            System.out.println(dragons);
        }
    }
}
