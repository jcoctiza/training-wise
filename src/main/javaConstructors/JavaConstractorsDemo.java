package main.JavaConstructors;

/**
 * Created by Tri-Nvent on 5/15/2018.
 */
public class JavaConstractorsDemo {
      private String dragon1;
      private String dragon2;

    JavaConstractorsDemo(){
        dragon1 = "Red Dragon";
        dragon2 = "Blue dragon";
        System.out.println("Dragons Inside the Constructor:");
    }

    public void showDragons(){
          System.out.println("Dragon 1 = "+dragon1);
          System.out.println("Dragon 2 = "+dragon2);
    }

    public static void main(String[] args){
        JavaConstractorsDemo dragons = new JavaConstractorsDemo();
        dragons.showDragons();
    }
}
