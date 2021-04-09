package lesson14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Collection1 implements CollectionUtils{




    @Override
    public java.util.Collection<Integer> union(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> union = new LinkedList<>();
        union.addAll(a);
        union.addAll(b);

        return union;
    }

    @Override
    public java.util.Collection<Integer> intersection(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> intersection = new ArrayList<>();

        for (Integer i: a ){
            if (b.contains(i)){
                intersection.add(i);
            }
        }


        return intersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> integerHashSet1 = new HashSet<>();

        integerHashSet1.addAll(a);
        integerHashSet1.addAll(b);

        return integerHashSet1;
    }


    @Override
    public Set<Integer> intersectionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
       HashSet<Integer> integerHashSet = new HashSet<>();

       for (Integer i: a){
           if (b.contains(i)){
               integerHashSet.add(i);

           }
       }
       return integerHashSet;
    }

    @Override
    public java.util.Collection<Integer> difference(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {


        return null;
    }
}
