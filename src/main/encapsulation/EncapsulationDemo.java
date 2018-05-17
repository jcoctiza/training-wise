package main.encapsulation;

class Encapsulation{
    private String Name;
    private int Age;
    private String Color;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}

public class EncapsulationDemo{
    public static void main(String args[]){
        Encapsulation dragon = new Encapsulation();
        dragon.setName("Red Dragon");
        dragon.setAge(150);
        dragon.setColor("Red");

        System.out.println("Dragon Name: " + dragon.getName());
        System.out.println("Dragon Age: " + dragon.getAge() +" Years Old");
        System.out.println("Dragon Color: " + dragon.getColor());
    }
}