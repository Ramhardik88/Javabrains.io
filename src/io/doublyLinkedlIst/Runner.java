package io.doublyLinkedlIst;

public class Runner
{
    public static void main(String args[])
    {
        DoublyLinkedList list=new DoublyLinkedList();

        list.insertAtstart(4);
        list.insertAtstart(7);
        list.insertAtstart(90);
        list.insertAtEnd(100);

        list.show();

    }
}

