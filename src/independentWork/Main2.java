package independentWork;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

public class Main2 {
    public static void main(String[] args) {
        Map<Object,String> map = new WeakHashMap<Object, String>();
        Object data = new Object();
        map.put(data,"information");

        data = null;
        System.gc();

        for (int i = 1 ; i < 1000 ; i++){
            if (map.isEmpty()){
                System.out.println( i + "Entry");
                break;

            }

        }
    }
}
