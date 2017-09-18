package Abstract_Factory;

/**
 * Created by Admin on 18.08.2017.
 */
public class ServerFactory implements ComputerAbstractFactory {

    private int ram;
    private int hdd;
    private int cpu;

    public ServerFactory(int ram, int hdd, int cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
