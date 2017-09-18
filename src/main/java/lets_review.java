import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Admin on 14.09.2017.
 */
public class lets_review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        String word;
        String[] word1;
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++){
            word = scan.nextLine();
            word1 = word.split("");
            for (int k = 0; k < word1.length; k++){
                if (k % 2 == 0){
                    even.append(word1[k]);
                } else odd.append(word1[k]);
            }
            list.add(even + " " + odd);
            even = new StringBuilder();
            odd = new StringBuilder();
        }

        for (String s: list){
            System.out.println(s);
        }
    }
}
