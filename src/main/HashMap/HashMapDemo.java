package main.HashMap;

import java.util.HashMap;

/**
 * Created by Tri-Nvent on 5/15/2018.
 */
public class HashMapDemo {
        public static void main(String[] args) {

            HashMap dragon = new HashMap();
            dragon.put("Name", "Red Dragon");
            dragon.put("Color", "Red");
            dragon.put("Legs", 4);
            dragon.put("Wings", 2);
            dragon.put("Power", "Fire");
            System.out.println(dragon);
            System.out.println("Using for loop:");
            dragon.forEach((key, value) -> {
                System.out.format(key+ " : " +value +"\n");
            });
        }
}
