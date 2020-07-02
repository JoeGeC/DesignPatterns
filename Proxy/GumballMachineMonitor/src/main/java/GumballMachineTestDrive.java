public class GumballMachineTestDrive {
    public static void main(String[] args){
        int count = 10;

        GumballMachine gumballMachine = new GumballMachine("Seattle", count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}
