package example;
class num{
    int num=10;
}
class num2 extends num{
    int num=20;
 void add()
    {
        System.out.println(super.num+num);
    }
}

public class add
{
    public static void main(String[] args) {
        num2 a=new num2();
        a.add();

    }
}
