import java.util.*;

/**
 * Created by Admin on 17.09.2017.
 */
public class Hacker8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> map = new HashMap<>();
        String line;
        String[] array = new String[count];
        for (int i = 0; i < count; i++){
            line = scanner.nextLine();
            array = line.split(" ");
            map.put(array[0], Integer.parseInt(array[1]));
        }
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()){
            line = scanner.nextLine();
            if (map.get(line) != null){
                list.add(line + "=" + map.get(line));
            } else list.add("Not found");
        }

        list.forEach(System.out::println);
    }

//    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for(int i = 0; i < n; i++){
//            String name = in.next();
//            int phone = in.nextInt();
//            // Write code here
//        }
//        while(in.hasNext()){
//            String s = in.next();
//            // Write code here
//        }
//        in.close();
//    }
}
