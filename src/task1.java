/**
 * Created by Admin on 23.04.2017.
 */
public class task1 {
    public static void main(String[] args) {

// метод 1
//        Integer[] array = {1, 2, 3, 7};
//        List<Integer> list = new ArrayList<>(Arrays.asList(array));
//        Collections.reverse(list);
//        System.out.println(list);

//        метод 2

        int[] array = {1, 2, 3, 7};
        int p = 1;
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - p];
            array[array.length - p] = temp;
            p++;
        }

        for (int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }
}
