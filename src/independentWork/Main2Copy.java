package independentWork;

import lesson16.ComparaterStringReverse;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main2Copy {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\cmp1\\Desktop\\TextFile.txt"));
            String s;
            ArrayList<String> list = new ArrayList<String>();

            while ((s = reader.readLine()) != null) {


                if (!s.isEmpty()) {

                    list.add(s);

                }
            }
            reader.close();
            FileOutputStream ot = new FileOutputStream
                    ("C:\\Users\\cmp1\\Desktop\\FileText.txt");
            for (int i = list.size() -1; i >= 0;i--){

                ot.write(list.get(i).getBytes(StandardCharsets.UTF_8));
                ot.write("\n".getBytes(StandardCharsets.UTF_8));
            }


           // String[] strings = list.toArray(new String[0]);
            // System.out.println(strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
