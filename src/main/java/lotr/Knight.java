package lotr;
import java.util.Random;

public class Knight extends Character {
    private static final Random rand = new Random();

    public Knight() {
        super(rand.nextInt(11) + 2, rand.nextInt(11) + 2);
    }

    @Override
    public void kick(Character c) {
        int damage = rand.nextInt(this.getPower() + 1);
        c.setHp(c.getHp() - damage);
        System.out.println("Knight kicks " + c.getClass().getSimpleName() + " for " + damage + " damage");
    }

    @Override
    public String toString() {
        return "Knight{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
