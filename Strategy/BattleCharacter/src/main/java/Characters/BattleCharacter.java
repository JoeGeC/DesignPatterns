package Characters;

import BattleActions.BattleAction;

public abstract class BattleCharacter {
    BattleAction action1;
    BattleAction action2;

    public abstract void sayName();

    public void doAction1(){
        action1.doAction();
    }

    public void doAction2(){
        action2.doAction();
    }
}
