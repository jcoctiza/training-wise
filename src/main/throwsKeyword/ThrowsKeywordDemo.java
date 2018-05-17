package main.throwsKeyword;

/**
 * Created by Tri-Nvent on 5/17/2018.
 */
public class ThrowsKeywordDemo {

    public static void main(String args[]) throws ArithmeticException{
        int a, b, c;
        a = 0;
        b = 20;
        try{
            c = b/a;
            System.out.print(c);
        }catch(ArithmeticException e){
            System.out.print("We do not divide any numbers to ZERO!");
        }
    }
}
