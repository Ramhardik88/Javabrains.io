package java8.function;

import java.util.function.DoubleFunction;

public class FunctionDoubleExample {
     static DoubleFunction<Integer> doubleFunction= a-> (int) a*20;
     static DoubleFunction<Integer> doubleFunction1= a-> (int) a/20;


     public static void main(String[] args) {
        System.out.println(doubleFunction.apply(20.19));
        System.out.println(doubleFunction1.apply(20.19));
     }
}
