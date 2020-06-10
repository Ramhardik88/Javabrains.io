package java8.function;



public class Example1 {
    FunctionalInterfaceexample functionalInterfaceexample= ( String a)->{
        System.out.println(a.toUpperCase());
    };
    FunctionalInterfaceexample functionalInterfaceexample1= (  a)->{
        System.out.println(a.toUpperCase());
    };

    FunctionalInterfaceexample functionalInterfaceexample2= a-> System.out.println(a.toLowerCase());



    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.functionalInterfaceexample.sayMessage("hello java 8");
        example1.functionalInterfaceexample2.sayMessage("HELLO JavaA8");
    }

}
