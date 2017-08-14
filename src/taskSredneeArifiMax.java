/**
 * Created by Admin on 23.04.2017.
 */
public class taskSredneeArifiMax {
    public static void main(String[] args) {
        int[] array = {2, 2, 4, 4};
        float summ = 0;
        int max = 0;
        for(int k : array){
            summ += k;
            if (k > max)
                max = k;
        }

        System.out.println(summ / array.length + ", " + max);

    }

}
