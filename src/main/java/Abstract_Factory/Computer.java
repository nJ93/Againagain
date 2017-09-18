package Abstract_Factory;

/**
 * Created by Admin on 18.08.2017.
 */
public abstract class Computer {

    public abstract int getRAM();
    public abstract int getHDD();
    public abstract int getCPU();

    @Override
    public String toString() {
        return "RAM = " + this.getRAM() + " HDD = " + this.getHDD() + " CPU = " + this.getCPU();
    }
}
