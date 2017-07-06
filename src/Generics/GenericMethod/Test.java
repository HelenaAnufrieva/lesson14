package Generics.GenericMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hillel on 06.07.2017.
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        System.out.println("List before generic-method: " + intList);
        Example.fill(intList, 0);
        System.out.println("List after generic-method: " + intList);
    }

}
