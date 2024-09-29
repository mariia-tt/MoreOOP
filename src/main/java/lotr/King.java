package lotr;

import java.util.Random;

public class King extends Character implements InnerCharacter {
    /*
     * - attributes: int power=from 5 to 15, int hp=from 5 to 15
     * - methods: void kick(Character c) {
     * decrease number of hp of the enemy by random
     * number which will be in the range of his power
     * }
     */
    public King() {
        setPower(new Random().nextInt(11) + 5);// 0-10 + 5
        setHp(new Random().nextInt(11) + 5);
    }
}
