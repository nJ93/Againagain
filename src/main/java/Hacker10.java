import java.util.Scanner;

/**
 * Created by Admin on 17.09.2017.
 */
public class Hacker10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base10 = scanner.nextInt();
        String base2 = Integer.toBinaryString(base10);

        int count = 0;
        String[] array = base2.split("0");

        int max = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].length() > max){
                max = array[i].length();
            }
        }

        System.out.println(max);
    }
}
