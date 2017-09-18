package Factory;

/**
 * Created by Admin on 18.08.2017.
 */
public class TestFactory {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer("pc", 512, 2048, 7000);
        Computer computer1 = ComputerFactory.getComputer("server", 1024, 765, 76767);
        System.out.println(computer);
        System.out.println(computer1);
    }
}
