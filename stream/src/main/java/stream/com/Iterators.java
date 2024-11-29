package stream.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Integer num= iterator.next();
            System.out.println(num);
        }
      Collections.reverse(arrayList);
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));

        double number = Math.pow(2,5);
        System.out.println(number);

    }
}
