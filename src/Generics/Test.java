package Generics;

/**
 * Created by Hillel on 06.07.2017.
 */
public class Test {
    public static void main(String[] args)
    {
        MyClass <Integer> value1 = new MyClass<Integer>(new Integer(10));
        System.out.println(value1);

        Integer intValue1 = value1.getValue();
        MyClass<String> value2 = new MyClass<String>("Hi generics");
        System.out.println(value2);

        //Integer intValue2 = value2.getValue();
    }
}
