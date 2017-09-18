import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AB {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String str = reader.readLine();
        String[] array = str.split(" ");
        int result = 0;
        for (int i = 0; i < array.length; i++){

            result += Integer.parseInt(array[i]);
        }

        System.out.println(result);

    }
}
