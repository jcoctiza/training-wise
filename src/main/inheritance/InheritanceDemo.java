package main.inheritance;

/**
 * Created by Tri-Nvent on 5/10/2018.
 */

class InheritanceDemo {
    public static void main(String[ ] args) {
        RedDragon d = new RedDragon();
        d.breathe();
    }
}

class Dragon {
    String power;
    public void breathe() {
        System.out.println(power);
    }
}

class RedDragon extends Dragon {
    RedDragon() {
        power = "Dragon Breathes Fire";
    }
}