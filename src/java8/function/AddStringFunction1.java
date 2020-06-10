package java8.function;

import java.util.function.Function;

public class AddStringFunction1
{
         static Function<String,String> addfunction=  name -> name.toUpperCase().concat("HARDIK");
         static Function<String ,Integer> addString1=name->name.length();
         static Function<String ,Boolean> addString2=name->name.contains("test");
         static Function<Integer ,Boolean> addString3=name->name>10;
         static Function<Integer ,Integer> addString4=name -> name%2 ;
         static Function<String ,String> addString5= name -> name.toLowerCase() ;


         static  Function<Integer,Integer> add= a->a+2;
         static  Function<Integer,Integer> mul= a->a*2;
         static Function<Integer,String> even=a->{
             if(a%2==0)
                 return "it is even";
             else
                 return "it is odd";
         };


    public static void main(String[] args) {
        System.out.println(  addfunction.apply("hello "));
        System.out.println(  addString1.apply("testhello "));
        System.out.println(  addString2.apply("test123"));
        System.out.println(  addString3.apply(10));
        System.out.println(addString4.apply(10));
        System.out.println(addString4.apply(11));
        System.out.println(addfunction.andThen(addString5).apply("Ram"));
        System.out.println(add.andThen(mul).apply(2));
        Function<Integer, Integer> data = mul.compose(add);     // inside the compose will execute first
        System.out.println(data.apply(3));
        System.out.println(even.apply(2));
    }
}
