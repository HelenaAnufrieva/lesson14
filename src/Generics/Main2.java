package Generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Hillel on 06.07.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        //list.add(10); // error

        List list2 = list;
        for (Iterator<String> itemItr = list2.iterator();
                itemItr.hasNext();)
            System.out.println(itemItr.next());
    }
}
