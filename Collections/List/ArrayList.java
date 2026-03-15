package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(10);

        list.add(10);
        list.add(20);
        list.add(30);
       System.out.println(list);
       System.out.println(list.size());
        System.out.println(list.isEmpty());
      System.out.println(list.contains(20));
      list.remove(1);
        list.remove(Integer.valueOf(30));

        list.addAll(list2);
        list.removeAll(list2);
        list.retainAll(list2);
    list.clear();

            //List

        System.out.println(list2);
        System.out.println( list2.get(1));
        list2.set(1,200);
        System.out.println(list2);
        list2.add(1,300);
        System.out.println(list2);
        System.out.println(list.remove(2));
    }
}

