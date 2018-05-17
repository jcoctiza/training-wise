package main.javaException;

/**
 * Created by Tri-Nvent on 5/16/2018.
 */
public class JavaExceptionDemo {
    public static void main(String[] args) {
        int a = 0;
        int b = 20;
        String array[ ] = {"James", "Carlo", "Octiza"};
        System.out.println("For Arithmetic Operation:");
        try {
            int c = b/a;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Something went wrong due to "+ e);
        }

        System.out.println("\nFor Arrays:");
        try {
            System.out.println(array[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong due to "+ e);
        }
        finally{
            System.out.println("\nJava Exception Demo");
        }
    }
}
