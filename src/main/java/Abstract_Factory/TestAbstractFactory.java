package Abstract_Factory;

import java.util.Calendar;

/**
 * Created by Admin on 18.08.2017.
 */
public class TestAbstractFactory {



    public static void test(){
        Computer pc = ComputerFactory.getComputer(new PCFactory(123,123,123));
        Computer server = ComputerFactory.getComputer(new ServerFactory(13,13,13));
        System.out.println(pc);
        System.out.println(server);
    
    }

    public static void main(String[] args) {
        test();
    }
}
