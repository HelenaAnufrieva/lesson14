package Generics.GenericMethod;

import java.util.List;

/**
 * Created by Hillel on 06.07.2017.
 */
public class Example {
    public static <T> void fill (List<T> list, T val)
    {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}
