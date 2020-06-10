package java8.function;

import java.nio.charset.IllegalCharsetNameException;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

public class ToDoubleBiFunctionexample {
    static   ToDoubleBiFunction<Integer, Double> toDoubleBiFunction=(a,b)->a+b;
    static   ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction1=(a,b)->a+b;

  static   ToDoubleFunction<Integer>toDoubleFunction =a->a*8;
    static   ToDoubleFunction<Float>toDoubleFunction1=a->a*8;

    public static void main(String[] args) {
        System.out.println(toDoubleBiFunction.applyAsDouble(20,70.6754));
        System.out.println(toDoubleBiFunction1.applyAsDouble(20,70));
        System.out.println(toDoubleFunction.applyAsDouble(9));
        System.out.println(toDoubleFunction1.applyAsDouble(34.545f));
    }

}
