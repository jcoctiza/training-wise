package main.THIS_Keyword;

/**
 * Created by Tri-Nvent on 5/15/2018.
 */
public class THIS_KeywordDemo {
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
        dragon obj = new dragon();
        obj.setData("Red Dragon","Red");
        obj.showData();
    }
}
class dragon extends THIS_KeywordDemo{
    dragon(){legs = 2;}
}
