package lesson16;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeSet.add("wwww");
        treeSet.add("qqqq");
        treeSet.add("eeee");
        treeSet.add("rrrr");
        treeSet.add("tttt");

        for (String s: treeSet){
            System.out.println(s);
        }
    }
}
