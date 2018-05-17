package main.Strings;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class EndsWithDemo {
    public static void main(String[] args){
        String dragon = "Dragons";
        String endsWith = "ns";
        boolean contains = dragon.endsWith(endsWith);
        if (contains == true) {
            System.out.println("Yes! The Word Dragons ends with: "+endsWith);
        }else{
            System.out.println("Nope! The Word Dragons don't end with: "+endsWith);
        }
    }
}
