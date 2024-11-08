package stream.com;

import com.sun.source.doctree.EscapeTree;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {


//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        final List<Integer> squardList = numbers.stream()
//                .map(n->n*n)
//                .peek(System.out::println)
//                .collect(Collectors.toList());



//        List<Integer> numbers = Arrays.asList(5,3,1,4,2);
//
//        numbers.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEachOrdered(System.out::println);

//        List<String> word = Arrays.asList("apple","banana","kiwi","cherry");
//
//        List<String> sortedOrder =word.stream()
//                .sorted(Comparator.comparingInt(String::length).reversed())
//                .toList();
//        sortedOrder.forEach(System.out::println);
//        System.out.println(sortedOrder);



//        List<String> numbers =Arrays.asList("apple","bananajhhk","kiwi","cherry","apple","banana","kiwi","cherry");
//        numbers.stream()
//                .skip(1 )
//                .limit(3)
//                .sorted(Comparator.comparingInt(String::length).reversed())
//                .collect(Collectors.toList())
//                .forEach(System.out::println);


//


        List<Employee> employees= Arrays.asList(
                new Employee("kishi","hr",8000),
                new Employee("king","it",80000),
                new Employee("warrior","hr",56000),
                new Employee("dev","it",8000)
        );

//        Map<String,List<Employee>>employeeByDepartment=
//                employees.stream()
//                        .collect(Collectors.groupingBy(Employee::getDepartment));


//        employeeByDepartment.forEach((departent,employeeList)->{
//            System.out.println("Department ="+departent);
//            employeeList.forEach(System.out::println);
//        });


//        Map<Boolean,List<Employee>>filtering =
//                employees.stream()
//                        .collect(Collectors.partitioningBy(employee -> employee.getSalary()>50000));
//
//        System.out.println("employee with salary >50000");
//        filtering.get(true).forEach(System.out::println);
//
//        System.out.println("employee with salary <50000");
//        filtering.get(false).forEach(System.out::println);

        Map<Boolean,List<Employee>> store = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary()>29999));

        store.get(true).forEach(System.out::println);





    }





}
