package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machines = {truck, bulldozer, excavator};
        for (Machine machine : machines) {
            System.out.println(machine.doWork());
            System.out.println(machine.stopWork());
        }
    }
}
