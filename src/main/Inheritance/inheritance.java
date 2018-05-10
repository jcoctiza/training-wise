package main.Inheritance;

    class Dragon {
        String name;
        int legs;
        String gender;
        String color;
        String ability_1;
        String ability_2;
        String ability_3;

        public void Dragon() {
            System.out.println("Name: "+name);
            System.out.println("Legs: "+legs);
            System.out.println("Gender: "+gender);
            System.out.println("Color: "+color);
            System.out.println("Ability 1: "+ability_1);
            System.out.println("Ability 2: "+ability_2);
            System.out.println("Ability 3: "+ability_3);
            System.out.println("\n");
        }
    }

    class RedDragon extends Dragon {
        RedDragon() {
            name = "Red Dragon";
            legs = 4;
            gender = "Male";
            color = "Red";
            ability_1 = "Fly";
            ability_2 = "Breath Fire";
            ability_3 = "Invincible";
        }
    }
    class BlueDragon extends Dragon {
        BlueDragon() {
        name = "Blue Dragon";
        legs = 2;
        gender = "Un-identified";
        color = "Blue";
        ability_1 = "Fly";
        ability_2 = "Breath Ice";
        ability_3 = "Very Fast";
    }
}

    class DragonClass {
        public static void main(String[] args) {
            BlueDragon blueDragon = new BlueDragon();
            RedDragon redDragon = new RedDragon();

            blueDragon.Dragon();
            redDragon.Dragon();
        }
    }
