package stream.com;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NewStream {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);

        Predicate<Integer> predicate =new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2==1;
            }
        };

       nums.stream()
               .filter(predicate)
               .sorted()
               .map(n->n*1)
               .forEach(n-> System.out.println(n));


    }
}
