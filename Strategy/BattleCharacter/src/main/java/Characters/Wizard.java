package Characters;

import BattleActions.Fireball;
import BattleActions.Frost;

public class Wizard extends BattleCharacter {
    public Wizard() {
        action1 = new Fireball();
        action2 = new Frost();
    }

    @Override
    public void sayName() {
        System.out.println("I'm a wizard!");
    }
}
