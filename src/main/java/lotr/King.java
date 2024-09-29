package lotr;

import java.util.Random;

public class King extends Character {
    private static final Random rand = new Random();

    public King() {
        super(rand.nextInt(11) + 5, rand.nextInt(11) + 5);
    }

    @Override
    public void kick(Character c) {
        int damage = rand.nextInt(this.getPower() + 1);
        c.setHp(c.getHp() - damage);
        System.out.println("King kicks " + c.getClass().getSimpleName() + " for " + damage + " damage");
    }

    @Override
    public String toString() {
        return "King{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
