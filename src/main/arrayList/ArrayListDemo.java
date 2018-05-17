package main.arrayList;

import java.util.ArrayList;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList dragon = new ArrayList();
        System.out.println("Size of arrayList upon creation: " + dragon.size());

        dragon.add("Blue Dragon");
        dragon.add("Red Dragon");
        dragon.add("Black Dragon");

        System.out.println("Size of arrayList after adding elements: " + dragon.size());
        System.out.println("List of all elements: " + dragon);

        dragon.remove(2);
        System.out.println("See contents after removing element by index: " + dragon);

        System.out.println("Size of arrayList after removing elements: " + dragon.size());
        System.out.println("List of all elements after removing elements: " + dragon);

        if (dragon.contains("Red Dragon") == true) {
            System.out.println("Red Dragon Exists");
        }
    }

}

