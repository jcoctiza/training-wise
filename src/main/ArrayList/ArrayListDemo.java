package main.ArrayList;

import java.util.ArrayList;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class ArrayListDemo {
    public static void main(String[] args){
        //Creating a generic ArrayList
        ArrayList dragon = new ArrayList();
        //Size of arrayList
        System.out.println("Size of ArrayList at creation: " + dragon.size());
        //Lets add some elements to it
        dragon.add("Blue Dragon");
        dragon.add("Red Dragon");
        dragon.add("Black Dragon");

        //Recheck the size after adding elements
        System.out.println("Size of ArrayList after adding elements: " + dragon.size());

        //Display all contents of ArrayList
        System.out.println("List of all elements: " + dragon);

        //Remove some elements from the list
        dragon.remove("");
        System.out.println("See contents after removing one element: " + dragon);

        //Remove element by index
        dragon.remove(2);
        System.out.println("See contents after removing element by index: " + dragon);

        //Check size after removing elements
        System.out.println("Size of arrayList after removing elements: " + dragon.size());
        System.out.println("List of all elements after removing elements: " + dragon);

        //Check if the list contains "K"
        if (dragon.contains("Red Dragon") == true) {
            System.out.println("Red Dragon Exists");
        }
    }

}

