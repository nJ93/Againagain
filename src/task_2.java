import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class task_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String name;
        String phone;
        String changedPhone;
        Map<String, String> map = new HashMap<>();



        String line;
        String newLine = "";
        while((line=reader.readLine())!=null && line.length()!=0){
            newLine += " " + line;
            System.out.println(line);
        }
        reader.close();

//        System.out.println(newLine.trim());
//
        String[] array = newLine.trim().split(" ");

        for (int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }

//        for (int i = 0; i <= array.length; i++){
//            name = array[i];
//            changedPhone = doNumberFormat(array[i + 1]);
//            if (map.containsKey(name) && changedPhone.length() >= 7){
//                map.put(name, map.get(name) + changedPhone);
//            }
//            else if (changedPhone.length() >= 7){
//                map.put(name, changedPhone);
//            }
//            i++;
//        }

//
//
//        while (true) {
//            name = reader.readLine();
//            if (name.equals("")) break;
//            phone = reader.readLine();
//            changedPhone = doNumberFormat(phone);
//
//            if (map.containsKey(name) && changedPhone.length() >= 7){
//                map.put(name, map.get(name) + changedPhone);
//            }
//            else if (changedPhone.length() >= 7){
//                map.put(name, changedPhone);
//            }
//
//        }

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()  + "\n" + entry.getValue());
        }

    }

    public static String doNumberFormat(String number){
        String newFormat = number.replaceAll("[^0-9]", "");
        String result = null;
        if (newFormat.length() == 7){
           result = "+7495" + newFormat;
        }
        else if (newFormat.length() == 11){
            if (newFormat.startsWith("8")){
                result = "+7" + newFormat.substring(1);
            } else result = "+" + newFormat;
        }

        return result + " ";
    }
}
