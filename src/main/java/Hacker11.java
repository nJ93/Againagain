import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by Admin on 18.09.2017.
 */
public class Hacker11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[count];
        for (int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
        }

        double mean = (double)IntStream.of(array).sum() / count;
        Arrays.sort(array);
        double median;

        if (array.length % 2 == 0){
            median = (double)(array[array.length/2] + array[array.length/2 - 1])/2;
        } else median = array[array.length/2];

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < array.length; i++){
            if (map.get(array[i]) == null){
                map.put(array[i], 1);
            } else map.put(array[i], map.get(array[i]) + 1);
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println(decimalFormat.format(mean));
        System.out.println(decimalFormat.format(median));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(map.firstKey());
    }
}
