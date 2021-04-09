package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainHomeWork {
    public static void main(String[] args) {
       LinkedList<Integer> integers = new LinkedList<>();
     LinkedList<Integer> integers1 = new LinkedList<>();
        Collection1 collection1 = new Collection1();
        integers.add(7);
        integers.add(2);
        integers.add(7);
        integers.add(9);
        integers.add(6);
        integers1.add(7);
        integers1.add(2);
        integers1.add(6);
        collection1.intersection(integers,integers1);
        System.out.println(collection1.intersection(integers,integers1));

    }
}
