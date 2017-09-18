import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++){
            if (map.get(array[i]) == null){
                map.put(array[i], 1);
            } else map.put(array[i], map.get(array[i]) + 1);
        }

        System.out.println(mean);
        System.out.println(median);
        for ()
    }
}
