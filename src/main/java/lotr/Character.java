package lotr;

import java.util.Random;

public class Character {
    // attributes: int power, int hp
    private int power;
    private int hp;

    // methods: void kick(Character c), boolean isAlive()
    public Character() {
        this.power = power;
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - (new Random().nextInt(this.getPower()) + 1));
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (hp < 0) {
            this.hp = 0;
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

}
