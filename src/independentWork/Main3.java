package independentWork;

import Lesson19.CopyWithCommanI0;
import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;

import java.io.IOException;

public class Main3 extends CopyUtils {
    public static void main(String[] args) {
        CopyUtils copyUtils = new CopyUtils();
        CopyWithCommanI0 copyWithCommanI0 = new CopyWithCommanI0();
        String from = "C:\\Users\\cmp1\\Desktop\\FileText.txt";
        String to = "C:\\Users\\cmp1\\Desktop\\File.txt";
        FileUtils fileUtils = new FileUtils();


        try {

            copyWithCommanI0.copy(from,to);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
