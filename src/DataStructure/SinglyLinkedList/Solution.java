package DataStructure.SinglyLinkedList;

public class Solution {
    public static void main(String[] args) {
           SinglyLinkedList sll= new SinglyLinkedList();
            sll.appendNode(new Node(1,23));
            sll.printlist();
            sll.appendNode(new Node(2,45));
            sll.appendNode(new Node(3,10));
            sll.appendNode(new Node(4,12));
            sll.appendNode(new Node(5,80));
            sll.prepended(new Node(0,120));
            sll.insertNodeAfter(3,new Node(6,40));

            sll.updateByKey(0,11);

            sll.printlist();
            sll.deleteBykey(5);
            sll.printlist();


    }
}
