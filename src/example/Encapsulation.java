package example;



class Author{
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
class Book{
    private double price;
    private int qtyinstock;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyinstock() {
        return qtyinstock;
    }

    public void setQtyinstock(int qtyinstock) {
        this.qtyinstock = qtyinstock;
    }
}

public class Encapsulation
{
    public static void main(String[] args) {

        Author au= new Author();      // constructor to set the name;
        au.setName("jk Rowling");
        au.setEmail("abc@abc.com");
        au.setGender('f');

        Book bo=new Book();        //constructor
         bo.setPrice(12345.45);
         bo.setQtyinstock(10);


        System.out.println("Name is: "+au.getName());
        System.out.println("gmail: "+au.getEmail());
        System.out.println("gender: "+au.getGender());
        System.out.println("cost of the book: "+bo.getPrice());
        System.out.println("quantity of book: "+bo.getQtyinstock());


    }
}
