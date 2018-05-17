package main.StaticBlock;

/**
 * Created by Tri-Nvent on 5/15/2018.
 */
public class StaticBlockDemo {
    static String dragon;
    static int legs;
    static{
        dragon = "Red Dragon";
        legs = 4;
    }
public static void main(String[] args){
        System.out.println("Dragon name: "+dragon);
        System.out.println("Number of legs: "+legs);
}
}
