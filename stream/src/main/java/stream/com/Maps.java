package stream.com;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(2,"kishi");
        hashMap.put(1,"kishore");
        hashMap.put(3,"d");
//        System.out.println(hashMap);
//        System.out.println(hashMap.get(1));
//        hashMap.remove(3);
        System.out.println(hashMap);
        System.out.println(hashMap.size());
       int  count = 1;
        while (hashMap.isEmpty() == false){
            System.out.println(hashMap.get(count));
            hashMap.remove(count);
            count++;
        }


        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"kishore");
        treeMap.put(10,"kishi");
        treeMap.put(3,"king");
        treeMap.put(4,"king");
        treeMap.put(4,"re");
        System.out.println(treeMap);

        System.out.println( treeMap.ceilingKey(2) );
        System.out.println( treeMap.floorKey(2) );

        Set<Integer> keys = treeMap.keySet();
        System.out.println(keys);


    }
}
