package lotr;

/*- attributes: int power=10, int hp=10
- methods: void kick(Character c) { 
    kill everybody weaker than him, 
    otherwise decrease the power of character by 1 
  }*/
public class Elf extends Character implements InnerCharacter {
    public Elf() {
        setPower(10);
        setHp(10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        } else {
            c.setPower(c.getPower() - 1); // "this.getPower()" - loser's power
        }
    }
}
