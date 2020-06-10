package java8.function;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

public class DoubleToIntFunctionExample
{
  static   DoubleToIntFunction doubleToIntFunction= a-> (int) a;
  static DoubleToLongFunction doubleToLongFunction=a-> (long) a;

    public static void main(String[] args) {
        System.out.println(doubleToIntFunction.applyAsInt(90.57356));
        System.out.println(doubleToLongFunction.applyAsLong(905678905.5736));
    }
}
