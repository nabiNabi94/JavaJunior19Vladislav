package independentWork;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class sortTextFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\cmp1\\Desktop\\TextFile.txt") ;
        File j = new File("C:\\Users\\cmp1\\Desktop\\FileText.txt");
        String s = "\nPopov\n one\n law";



        try {
            InputStream is = new FileInputStream(f);
            OutputStream os = new FileOutputStream(j);
            int c = 0;
            while (true){
                c = is.read();
                if (c != -1 || j.createNewFile()  ){
                    os.write(s.getBytes(StandardCharsets.UTF_8));
                }
                else {
                    break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        }
}
