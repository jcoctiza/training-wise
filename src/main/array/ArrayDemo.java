package main.array;

/**
 * Created by Tri-Nvent on 5/10/2018.
 */
public class ArrayDemo {
        public static void main(String args[]){

            //for String
            String dragon[] = {"Red Dragon","Blue Dragon","Black Dragon"};
            System.out.println("Display Selected Dragon: "+dragon[1]+"\n");
            System.out.println("Display All Dragons:");
            for (String dragons: dragon) {
                System.out.println(dragons);
            }

            //for Int
            int numbers[] = new int[10];
            System.out.println("\nDisplay Numbers:");
            for (int count=0;count<10;count++){
                numbers[count]=count+1;
            }
            for (int count=0;count<10;count++){
                System.out.println("array["+count+"] = "+numbers[count]);
            }
        }
}
