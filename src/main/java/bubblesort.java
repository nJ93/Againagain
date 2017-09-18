/**
 * Created by Admin on 23.04.2017.
 */
public class bubblesort {
    public static void main(String[] args) {
//        int[] array = {2, 55, 4, 56, 54, 3, 12, 33, 65};
        int[] arr = {77, 99, 44, 55, 22, 88, 11, 0, 66, 33};


//        for(int i = arr.length-1 ; i > 0 ; i--){
//
//            for(int j = 0 ; j < i ; j++){
//
//                if( arr[j] > arr[j+1] ){
//
//                    int tmp = arr[j];
//
//                    arr[j] = arr[j+1];
//
//                    arr[j+1] = tmp;
//                }
//            }
//        }

        int out, in;

        for (out = arr.length - 1; out>1; out--){
            for (in = 0; in < out; in++){
                if(arr[in] > arr[in + 1]){
                    int temp = arr[in];
                  arr[in] = arr[in + 1];
                  arr[in + 1] = temp;
                }
            }
        }

        for (int l = 0; l < arr.length; l++) {
            System.out.println(arr[l]);
        }
    }
}
