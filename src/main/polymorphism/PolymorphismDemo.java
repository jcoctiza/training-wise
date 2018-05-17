package main.Polymorphism;

/**
 * Created by Tri-Nvent on 5/10/2018.
 */
public class PolymorphismDemo {
    public static void main(String args[ ]) {
        Dragon redDragon = new RedDragon();
        Dragon blueDragon = new BlueDragon();

        redDragon.breath();
        blueDragon.breath();
    }
}
class Dragon {
    public void breath() {
        System.out.println("Breathes");
    }
}
class RedDragon extends Dragon {
    public void breath() {
        System.out.println("Red Dragon: Breathes Fire");
    }
}
class BlueDragon extends Dragon {
    public void breath() {
        System.out.println("Blue Dragon: Breathes Ice");
    }
}

