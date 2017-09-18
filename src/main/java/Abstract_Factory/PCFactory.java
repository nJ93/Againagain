package Abstract_Factory;

/**
 * Created by Admin on 18.08.2017.
 */
public class PCFactory implements ComputerAbstractFactory {

    private int ram;
    private int hdd;
    private int cpu;

    public PCFactory(int ram, int hdd, int cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
