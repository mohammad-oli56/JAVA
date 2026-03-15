package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMore {
    static void main(String[] args) {
        List<String> furits = new ArrayList<>();
        furits.add("kiwi");
        furits.add("mango");
        furits.add("orange");
        furits.add("tomato");

        System.out.println(furits.size());
        System.out.println(furits.get(2));

        //normal for loop
        for (int i = 0 ; i<furits.size();i++ ){
            System.out.println(furits.get(i));
        }

        //for each
        for (String furit:furits){
            System.out.println(furit);
        }

        //for iterator
        Iterator<String> fe = furits.iterator();
        while (fe.hasNext()){
            System.out.println(fe.next());
        }

        //sublist
        List<String> subList = furits.subList(0,2);
        System.out.println(subList);
    }
}
