public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;

    private String location;

    GumballMachine(String location, int numberOfGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberOfGumballs;
        if(numberOfGumballs > 0)
            state = noQuarterState;
        this.location = location;
    }

    void insertQuarter(){
        state.insertQuarter();
    }

    void ejectQuarter(){
        state.ejectQuarter();
    }

    void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0)
            count--;
    }

    @Override
    public String toString() {
        return "\nMighty Gumball Inc.\n" +
                "Java-enabled Standing Gumball Model #2020\n" +
                "Inventory: " + count + "\n";
    }

    State getState() {
        return state;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String getLocation() {
        return location;
    }
}
