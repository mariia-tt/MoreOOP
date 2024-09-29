package lotr;

import java.util.Random;

public class Knight extends Character implements InnerCharacter {
    /*
     * - attributes: int power=from 2 to 12, int hp=from 2 to 12
     * - methods: void kick(Character c) { like King }
     */
    public Knight() {
        setPower(new Random().nextInt(11) + 2);// 0-10 + 2
        setHp(new Random().nextInt(11) + 2);
    }
}
