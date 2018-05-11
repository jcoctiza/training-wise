package main.Strings;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class CasesDemo {
    public static void main(String[] args){
        String dragon = "DrAgOnS";
        String upperCase = dragon.toUpperCase();
        String lowerCase = dragon.toLowerCase();

        if(dragon == upperCase) {
            System.out.println("The word " + dragon +" is already on UpperCase ");
        }else{
            System.out.println("Covert To Uppercase : " + dragon.toUpperCase());
        }

        if(dragon == lowerCase) {
            System.out.println("The word " + dragon +" is already on LowerCase ");
        }else{
            System.out.println("Covert To Lowercase : " + dragon.toLowerCase());
        }
    }
}