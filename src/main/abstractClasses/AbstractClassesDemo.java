package main.AbstractClasses;
public class AbstractClassesDemo {
    public static void main(String[] args){
        RedDragon rd = new RedDragon();
        rd.power();
        BlueDragon bd = new BlueDragon();
        bd.power();
    }
}
abstract class Dragon{
    int wings = 2;
    int legs = 4;
    abstract public void power();
}
class RedDragon extends Dragon{
    public void power(){
        System.out.println("Breath Fire!");
    }
}
class BlueDragon extends Dragon{
    public void power(){
        System.out.println("Breath Ice!");
    }
}