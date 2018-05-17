package main.strings;

/**
 * Created by Tri-Nvent on 5/11/2018.
 */
public class CompareToDemo {
        public static void main(String[] args){
            String dragon = "Dragons";

            int compare = dragon.compareTo("dragons");
            if(compare == 0){
                System.out.println("Comparing: Matched!");
            }else{
                System.out.println("Comparing: Didn't Matched!");
            }
            int compareIgnoreCase = dragon.compareToIgnoreCase("dRaGoNs");
            if(compareIgnoreCase == 0){
            System.out.println("Ignore Case Comparing: Matched!");
            }else{
                System.out.println("Ignore Case Comparing: Didn't Matched!");
            }
    }
}
