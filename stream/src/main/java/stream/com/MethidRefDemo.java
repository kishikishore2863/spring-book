package stream.com;

import java.util.*;

public class MethidRefDemo {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>(Arrays.asList("mad##%an","","al&%^&an","rose","","tom","alex%$!!@",null));

        Stack<Integer> ki = new Stack<>();
        ki.add(1);
        ki.add(1);
        ki.add(1);
        ki.add(1);
        System.out.println(ki);
        ki.pop();
        System.out.println(ki);
        System.out.println(ki.peek());
        System.out.println(ki.isEmpty());
        ki.clear();
        System.out.println(ki);
        System.out.println(ki.isEmpty());


        Vector<Integer> vec = new Vector<>();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        System.out.println(vec);



        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(-1);
        System.out.println(treeSet+"from treeSet");
        System.out.println(treeSet.floor(8));
        System.out.println(treeSet.ceiling(8));

        for(Integer n : treeSet){
            System.out.println(n);
        }



        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(1);
        arrayDeque.offer(2);
        arrayDeque.offer(3);
        arrayDeque.offer(4);
        arrayDeque.offer(5);
        System.out.println(arrayDeque.peek());
        arrayDeque.poll();
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());



        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(6);
        priorityQueue.offer(5);
        priorityQueue.offer(4);
        priorityQueue.offer(3);
        priorityQueue.offer(2);
        priorityQueue.offer(1);
        System.out.println(priorityQueue);
        while (priorityQueue.isEmpty() == false){
            System.out.println(priorityQueue.peek());
            priorityQueue.poll();
        }







    }
}
