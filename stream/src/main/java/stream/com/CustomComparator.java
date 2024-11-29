package stream.com;

import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,20,13,4,16,6));
//        System.out.println(arrayList);
//        Collections.reverse(arrayList);
//        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);


     List<Integer> li =    arrayList.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(li);

        System.out.println(arrayList.stream()
                .max(Comparator.naturalOrder()));


    }
}
