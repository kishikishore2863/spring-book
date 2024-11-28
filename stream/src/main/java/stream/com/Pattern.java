package stream.com;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Type;
import java.sql.Array;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pattern {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

//        number.stream()
//                .filter(e->e % 2 == 0)
//                .map(e-> e * 2)
//                .forEach(e -> System.out.println(e));

//        number.stream()
//                .flatMap(e-> Stream.of(e * 2, e * 5, e * 8))
//                .forEach(e-> System.out.println(e));

//
//      List<Integer> number1 = new ArrayList<>(Arrays.asList(3,2,1,8,76,5,43));
//      List<Integer> result = number1.stream()
//              .sorted()
//              .toList();
//        System.out.println(result);
//
//        List<String> str = new ArrayList<>(Arrays.asList("apple","car","abhi","ball"));
//        List<String>res = str.stream()
//                .sorted()
//                .toList();
//        System.out.println(res);
//
//        str.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(e-> System.out.println(e));
//
//        Optional<Integer> re =  number1.stream()
//                .max(Comparator.naturalOrder());
//        System.out.println(re);
//
//        List<String> listOfStrings = Arrays.asList("one","two","three","four","five","six");
//
//         String ressss = listOfStrings.stream()
//                .skip(listOfStrings.size()-1)
//                .findFirst()
//                .get();
//
//        System.out.println(ressss);
//
//        System.out.println(listOfStrings.getLast());

        List<Integer> listWithDuplicates = Arrays.asList(1,2,3,1,7,4,4,5,6);

//        listWithDuplicates.stream()
//                .distinct()
//                .sorted()
//                .forEach(e-> System.out.println(e));

//        listWithDuplicates.stream()
//                .filter(e->e%2==0)
//                .forEach(e-> System.out.println(e));



//        int numbers = 123456;
//        int sum = 0;
//        while(numbers>0){
//            int digit = numbers%10;
//            sum=sum+digit;
//            numbers = numbers/10;
//        }
//        System.out.println(sum);

//        int  stream = String.valueOf(numbers).chars()
//                .map(Character::getNumericValue)
//                .sum();
//        System.out.println(stream+"jnscjkxsa");
//
//        LocalDate birthday_date = LocalDate.parse("2003-06-28");
//        LocalDate current = LocalDate.now();
//        System.out.println(current);
//
//        long totalDays = ChronoUnit.DAYS.between(birthday_date, current);
//        long totalMonths = ChronoUnit.MONTHS.between(birthday_date,current);
//        long totalHours = ChronoUnit.HOURS.between(birthday_date,current);
//        System.out.println(totalDays);
//        System.out.println(totalMonths);
//
//        Period period = Period.between(birthday_date,current);
//        System.out.println(period.getYears());
//        System.out.println(period.getMonths());
//        System.out.println(period.getDays());


//
//        List<Integer> listOfInteger = Arrays.asList(45,12,56,15,24,75,31,89);
//
//       Optional<Integer> highest =  listOfInteger.stream()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst();
//        System.out.println(highest);
//
//        listOfInteger.stream()
//                .sorted()
//                .forEach(e-> System.out.println(e));










//
//       IntStream stream =  String.valueOf(numbers)
//                .chars();
//
//       stream.forEach(e-> System.out.println(e));
//
//
//            List<Integer> numbers = Arrays.asList(1,2,3,4);
//            System.out.println(  number.stream()
//                            .filter(e-> e%2==0)
//                            .map(e->e*1)
//                            .peek(e-> System.out.println(e))
//                            .reduce(0,(e,carry)->e+carry));
//
//        System.out.println(numbers.stream()
//                .mapToInt(e->e*1)
//                .sum()
//        );
//
//       int[] arr =  numbers.stream()
//                .filter(e->e%2==0)
//                .mapToInt(e->e*2)
//                .toArray();
//
//
//        System.out.println(Arrays.toString(arr));
//
//
//        String[] s =new String []{"sd","sjbdj"};
//        System.out.println(Arrays.toString(s));
//
//
//
//
//





//        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
//
//        Map<String, Long> wordCount = words.stream()
//                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
//
//        System.out.println(wordCount);



        List<Employee> employees = EmployeeData.get();

//        employees.stream()
//                .forEach(e-> System.out.println(e));

//        employees.stream()
//                .filter(e->e.getLastname().startsWith("m"))
//                .filter(e->e.getSalary()>20000.0)
//                .forEach(e-> System.out.println(e));


//        employees.stream()
//                .sorted((e1,e2)->e1.getFirstname().compareTo(e2.getFirstname()))
//                .forEach(e->System.out.println(e));

//        employees.stream()
//                .map(e ->e.getFirstname())
//                .sorted()
//                .forEach(e-> System.out.println(e));

//        System.out.println( employees.stream()
//                .filter(e->e.getDepartment().equals("IT"))
//                .count());


        System.out.println(  employees.stream()
                .filter(e->e.getDepartment().equals("IT"))
                .mapToDouble(e->e.getSalary())
                .sum());


        System.out.println(employees.stream()
                    .map(e->e.getSalary())
                    .max(Comparator.naturalOrder()));









    }
}
