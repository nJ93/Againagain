package Abstract_Factory;

public class PC extends Computer {

    private int ram;
    private int hdd;
    private int cpu;

    public PC(int ram, int hdd, int cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public int getRAM() {
        return this.ram;
    }

    @Override
    public int getHDD() {
        return this.hdd;
    }

    @Override
    public int getCPU() {
        return this.cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }
}
