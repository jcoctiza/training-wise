package main.thisKeyword;

/**
 * Created by Tri-Nvent on 5/15/2018.
 */
public class ThisKeywordDemo {
    String name;
    String color;
    int legs;
    public void setData(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void showData(){
        System.out.println("Dragon Name: "+name);
        System.out.println("Dragon Color: "+color);
        System.out.println("Legs: "+legs);
    }
    public static void main(String args[]){
        Dragon obj = new Dragon();
        obj.setData("Red Dragon","Red");
        obj.showData();
    }
}
class Dragon extends ThisKeywordDemo{
    Dragon(){this.legs = 2;}
}
