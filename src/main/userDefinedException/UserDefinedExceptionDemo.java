package main.userDefinedException;

/**
 * Created by Tri-Nvent on 5/17/2018.
 */
public class UserDefinedExceptionDemo {
    public static void main(String args[]) {
        try {
            throw new MyException("This is my Exception!");
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
class MyException extends Exception{
    String exception;
    MyException(String myException){
        exception = myException;
    }
    public String toString(){
        return (exception) ;
    }
}
