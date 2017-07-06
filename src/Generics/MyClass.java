package Generics;

/**
 * Created by Hillel on 06.07.2017.
 */
public class MyClass <T> {
    private T val;

    public MyClass (T arg)
    {
        val = arg;
    }

    public String toString()
    {
        return "{" + val + "}";
    }

    public T getValue()
    {
        return val;
    }
}
