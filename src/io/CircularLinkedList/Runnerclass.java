package io.CircularLinkedList;

public class Runnerclass
{
    public static void main(String args[]) {


        CircularlinkedList list = new CircularlinkedList();
        list.insertAtend(5);
        list.insertAtend(3);
        list.insertAtend(66);
        list.insertAtStart(4);


        list.show();
    }
}
