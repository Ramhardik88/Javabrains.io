package java8.function;

public class Example2 {
    static FunctionalInterfaceexample1 add = (a, b) -> {
        return a + b;
    };
    static FunctionalInterfaceexample1 sub = (a, b) ->
    {
        return a - b;
    };
    static FunctionalInterfaceexample1 mul = (a, b) ->
    {
        return a * b;
    };
    static FunctionalInterfaceexample1 add1 = (a, b) -> a + b;

    static FunctionalInterfaceexample1 sub2 = (a, b) -> a - b;

    static FunctionalInterfaceexample1 mul3 = (a, b) -> a * b;


    public static void main(String[] args) {
        System.out.println(add.operation(4, 5));
        System.out.println(sub.operation(9, 3));
        System.out.println(mul.operation(7, 2));
        System.out.println(add1.operation(4, 5));
        System.out.println(sub2.operation(9, 3));
        System.out.println(mul3.operation(7, 2));
    }
}
