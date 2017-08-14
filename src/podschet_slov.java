import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 24.04.2017.
 */
public class podschet_slov {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        Map<String, Integer> map = new HashMap<>();

        String array[] = s.replaceAll("[\".,]", "").toLowerCase().split(" ");


        for (int i = 0; i < array.length; i++){
            if (map.containsKey(array[i])){
                map.put(array[i], map.get(array[i]) + 1);
            }
            else map.put(array[i], 1);
        }

  //      PriorityQueue<Map.Entry<String, Integer>>


        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
