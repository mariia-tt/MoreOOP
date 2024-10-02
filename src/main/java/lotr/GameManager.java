package lotr;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1 + " attacks " + c2);
            c1.kick(c2);
            System.out.println(c2 + " has " + c2.getHp() + " hp left");

            if (!c2.isAlive()) {
                System.out.println(c2 + " has failed!");
                break;
            }

            System.out.println(c2 + " attacks " + c1);
            c2.kick(c1);
            System.out.println(c1 + " has " + c1.getHp() + " hp left");

            if (!c1.isAlive()) {
                System.out.println(c1 + " has failed!");
            }
        }
    }
}
