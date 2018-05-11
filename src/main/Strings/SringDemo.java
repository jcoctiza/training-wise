package main.Strings;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class SringDemo {
    public static void main(String[] args){
        String firstName = "James Carlo";
        String lastName = "Octiza";
        System.out.println("String Concatenation:");
        String fullName = firstName.concat(" "+lastName);
        System.out.println(fullName);
        System.out.println("\nUsing '+' Operator:");
        String FullName = firstName + lastName;
        System.out.println(FullName);

        System.out.println("Length of Full Name: " + FullName.length());
    }
}
