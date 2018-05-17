package main.strings;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class ContainDemo {
    public static void main(String[] args){
        String dragon = "Dragons";
        String a = "aaa";
        boolean contains = dragon.contains(a);
        if (contains == true) {
            System.out.println("Yes! The Word Dragons Contains: "+a);
        }else{
            System.out.println("Nah! The Word Dragons don't have: "+a);
        }
    }
}
