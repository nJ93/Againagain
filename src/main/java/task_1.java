import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class task_1 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String[] calls = reader.readLine().split(" ");
        Map<Integer, Integer> kv = new HashMap<>();

        for (int i = 0; i < calls.length; i++){
            for (int j = i + 1; j < calls.length; j++){
                if (calls[i].equals(calls[j])){
                    kv.put(i + 1, j + 1);
                    break;
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : kv.entrySet()){
            System.out.println(entry.getKey()  + " " + entry.getValue());
        }
    }
}
