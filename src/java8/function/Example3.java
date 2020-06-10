package java8.function;

import org.w3c.dom.ls.LSOutput;

public class Example3
{
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {     // type1
            @Override
            public void run() {
                System.out.println("hello ramkumar");
            }
        };
        Thread thread= new Thread(runnable);
        thread.start();
        System.out.println("-------------------");        // type-2
        Runnable runnable1=()->{
            System.out.println("Iam running..");
        };
        Thread thread1= new Thread(runnable1);
        thread1.start();


        System.out.println("-------------------");     // type3
        Runnable runnable2=()->{
            System.out.println("Iam running..");
        };
        Thread thread2= new Thread(runnable2);
        thread2.start();


        new  Thread(()->System.out.println("Iam playing..")).start();  // type4


    }


}
