package Abstract_Factory;

/**
 * Created by Admin on 18.08.2017.
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
