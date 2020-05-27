package Tree;

import java.util.LinkedList;
import java.util.Queue;

class  Node{
    int data;
    Node Left;
    Node right;
}
class Binarytree{


    public Node CreateTree(int value)
    {
        Node n= new Node();
        n.data=value;
        n.Left=null;
        n.right=null;

        return n;
    }

    public void InOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        InOrder(node.Left);
        System.out.print(node.data+" ");
        InOrder(node.right);
    }
    public void PreOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.data+" ");
        PreOrder(node.Left);
        PreOrder(node.right);
    }
    public void Postorder(Node node)
    {
        if(node==null)
        {
          return;
        }
        Postorder(node.Left);
        Postorder(node.right);
        System.out.print(node.data+" ");
    }

    public int getSumofTree(Node node)
    {
        if(node==null)
        {
            return 0;
        }

        return node.data +getSumofTree(node.Left)+getSumofTree(node.right);

    }
    public int getSumOfNode(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        return 1+getSumOfNode(node.Left)+getSumOfNode(node.right);
    }

    public int getLeafNode(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        if (node.Left==null && node.right==null){
            return 1;

        }
        return getLeafNode(node.Left)+getLeafNode(node.right);
    }
    public int getHeightOfTree(Node node)
    {
        if(node==null)
        {
            return -1;
        }
        return Math.max(getHeightOfTree(node.Left),getHeightOfTree(node.right))+1;

    }

    public void printATGIvenLevel(Node node,int level)
    {
        if(node==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.print(node.data+" ");
            return;
        }
        printATGIvenLevel(node.Left,level-1);
        printATGIvenLevel(node.right,level-1);

    }

    public void levelorderusingRecusion(Node node)
    {
        if(node==null)
        {
            return;
        }
        int height=getHeightOfTree(node);
        for(int i=0;i<=height;i++)
        {
            printATGIvenLevel(node,i+1);
            System.out.println();
        }
    }

    public void levelOrderTraversal(Node node) {
        if(node==null)
        {
            return;
        }

        Queue<Node> q=new LinkedList<>();

        q.add(node);
        while (q.size()>0)
        {
            Node top=q.remove();
            System.out.print(top.data+" ");

            if(top.Left!=null)
            {
                q.add(top.Left);
            }
            if(top.right!=null)
            {
                q.add(top.right);
            }
        }
    }
}

public class No_1_BinaryTree

{
    public static void main(String[] args) {

        Binarytree tree = new Binarytree();
        Node root=tree.CreateTree(2);

        root.Left= tree.CreateTree(7);
        root.Left.Left=tree.CreateTree(2);
        root.Left.right=tree.CreateTree(6);
        root.Left.right.Left=tree.CreateTree(5);
        root.Left.right.right = tree.CreateTree(11);
        root.right=tree.CreateTree(5);
        root.right.right=tree.CreateTree(9);
        root.right.right.Left=tree.CreateTree(4);

//        System.out.println("Inorder");
//        tree.InOrder(root);
//        System.out.println();
//
//        System.out.println("preorder");
//        tree.PreOrder(root);
//        System.out.println();
//
//        System.out.println("postorder");
//        tree.Postorder(root);
//
//
//        System.out.println("sum of binary tree "+ tree.getSumofTree(root));
//        System.out.println("sum of Node Present "+ tree.getSumOfNode(root));
//
//        System.out.println("no of child node "+tree.getLeafNode(root));
//
//        System.out.println("Get Height of tree "+tree.getHeightOfTree(root));
//        tree.printATGIvenLevel(root,3);
//        tree.levelorderusingRecusion(root);

        tree.levelOrderTraversal(root);


    }
}
