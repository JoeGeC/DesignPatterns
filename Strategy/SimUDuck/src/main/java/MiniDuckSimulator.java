import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.ModelDuck;
import FlyBehaviour.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
