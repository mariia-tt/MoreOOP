package lotr;

public class Hobbit extends Character implements InnerCharacter {
    public Hobbit() {
        setPower(0);
        setHp(3);
    }

    public void kick(Character c) {
        toCry();
    }

    public void toCry() {
        System.out.println("Hobbit crying");
        // + "Hobbit{hp=" + hp + ", power=" + power + "}" ??? setPower(this.hp)??
    }
}