package independentWork;

import java.util.HashMap;

public class MainCapacity {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new SimpleLRECache<>(2);
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.get(2);
        map.put(9,"e");
        System.out.println(map);
    }
}
