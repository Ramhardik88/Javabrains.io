package DataStructure.DoublyLinkedList;

public class Solution {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.displayList();
        dll.append(new Node(1,34));
        dll.append(new Node (2,78));
        dll.displayList();
        dll.append(new Node(3,124));
        dll.append(new Node (5,718));
        dll.insertNodeAfter(3,new Node(4,567));
        dll.deleteByKey(5);
        dll.displayList();
    }
}
