import java.util.ArrayList;
import java.util.List;


/**
 * Created by Admin on 23.08.2017.
 */
public class TestList {


    private int size;

    public static void doTest(List<String> list){
        list.add("abd");
        List<String> list1 = new ArrayList<>(list);
        list1.add("asdddd");
        list = list1;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.forEach(System.out::println);
        doTest(list);
        System.out.println("____________________________");
        list.forEach(System.out::println);

        Object a;
        byte h = 120;
        a = h;
        if (a instanceof Byte){
            System.out.println("yes");
        } else System.out.println(a.getClass());
    }
}
