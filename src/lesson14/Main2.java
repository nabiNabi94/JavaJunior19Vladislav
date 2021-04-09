package lesson14;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("eee");
        list.add("qqq");
        list.add("www");

        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        for (String s: list){
            System.out.println((s));
        }
        for (Iterator<String> iter = list.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
