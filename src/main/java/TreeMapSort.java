import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Admin on 23.04.2017.
 */
public class TreeMapSort {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 7, 7, 8, 9};
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < array.length; i++){
            if (map.containsKey(array[i])){
                map.put(array[i], map.get(array[i]) + 1);
            }
            else map.put(array[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int count = entry.getValue();

            while (count > 0){
                System.out.println(entry.getKey());
                count--;
            }
        }

        System.out.println(map);
    }
}
