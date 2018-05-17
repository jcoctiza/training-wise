package main.strings;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class ReplaceDemo {
    public static void main(String[] args){
        String dragon = "Red Dragon";
        String replace1 = "Bull";
        String replace2 = "Blue";
        String replace3 = "Black Bull";
        String newBeast = dragon.replace("Dragon",replace1);
        System.out.println(dragon);
        System.out.println("Dragon Replaced by "+replace1+" = "+newBeast);

        String newDragon = dragon.replaceFirst("Red",replace2);
        System.out.println("Red Replaced by"+replace2+" = "+newDragon);

        String newName = dragon.replaceAll(dragon,replace3);
        System.out.println(dragon+" Replaced by "+replace3+" = "+newName);
    }
}