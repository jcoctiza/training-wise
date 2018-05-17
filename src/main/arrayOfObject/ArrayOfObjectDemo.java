package main.ArrayOfObject;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class ArrayOfObjectDemo {
    public static void main(String[] args){
        Dragon dragonz[] = new Dragon[2] ;
        dragonz[0] = new Dragon();
        dragonz[1] = new Dragon();
        dragonz[0].setData(2,4);
        dragonz[1].setData(4,2);
        System.out.println("For Array Element: 0");
        dragonz[0].showData();
        System.out.println("\n");
        System.out.println("For Array Element: 1");
        dragonz[1].showData();
    }
}
class Dragon{
    int leg;
    int wing;
    public void setData(int legs,int wings){
        leg=legs;
        wing=wings;
    }
    public void showData(){
        System.out.println("Dragon's Leg ="+leg);
        System.out.println("Dragon's Wing ="+wing);
    }
}