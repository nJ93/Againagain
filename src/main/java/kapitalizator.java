import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 24.04.2017.
 */
public class kapitalizator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String newString = "";
        for (int i = 0; i < s.length(); i++){
            char k = s.charAt(i);
            if (k != Character.toUpperCase(k) && i == 0 ){
                newString += Character.toUpperCase(k);
            }
            else if ((k != Character.toUpperCase(k) || k == Character.toUpperCase(k)) && s.charAt(i - 1) == ' ' ){
                newString += Character.toUpperCase(k);
            } else {
                newString += Character.toLowerCase(k);
            }

        }


        System.out.println(newString);
    }
}
