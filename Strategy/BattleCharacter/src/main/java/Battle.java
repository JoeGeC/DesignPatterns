import Characters.BattleCharacter;
import Characters.Wizard;

public class Battle {
    public static void main(String[] args){
        BattleCharacter wizard = new Wizard();
        wizard.sayName();
        wizard.doAction1();
        wizard.doAction2();
    }
}
