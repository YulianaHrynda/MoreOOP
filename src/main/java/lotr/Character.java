package lotr;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;


@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
}
