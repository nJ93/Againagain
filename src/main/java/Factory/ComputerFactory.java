package Factory;

/**
 * Created by Admin on 18.08.2017.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, int RAM, int HDD, int CPU){
        if ("PC".equalsIgnoreCase(type)){
            return new PC(RAM, HDD, CPU);
        }
        else if ("Server".equalsIgnoreCase(type)){
            return new Server(RAM, HDD, CPU);
        }
        return null;
    }

}
