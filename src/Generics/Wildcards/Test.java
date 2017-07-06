package Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hillel on 06.07.2017.
 */
public class Test {

    public static Double sum (List<? extends Number> numList)
    {
        Double result = 0.0;
        for (Number num: numList)
        {
            result += num.doubleValue();
        }
        return result;
    }

    static void printList(List<?> list)
    {
        for (Object I: list)
            System.out.println("{" + I + "}");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);
        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);

        List <? super Integer> intList = new ArrayList<Integer>();
        System.out.println("The intList is: " + intList);
    }

}
