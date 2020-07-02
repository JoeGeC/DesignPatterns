public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There's no quarter inserted!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sold out!");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out!");
    }
}
