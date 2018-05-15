package main.StaticMethodAndVariable;

public class StaticMethodAndVariableDemo{
    public static void main(String args[]){
        Dragon d1 = new Dragon();
        d1.showData();
        Dragon d2 = new Dragon();
        d2.showData();
        Dragon.wings++;
        d1.showData();
    }
}

class Dragon {
        static int legs;
        static int wings;
    Dragon(){
        
        wings++;
    }
    public void showData(){
        System.out.println("Number og Legs: "+legs);
        System.out.println("Number of Wings: "+wings);
    }
    public static void increment(){
        legs++;
}
}
