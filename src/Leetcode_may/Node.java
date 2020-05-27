package Leetcode_may;
public class Node{
 int value;
 Node left;
 Node right;

 public Node(int value) {
  this.value = value;
 }
}

 class BSTfrompreorder
 {
  public  static Node bstFromPreorder(int []preorder)
  {
   int n=preorder.length;
   
   if(n==0) return null;
    Node root=new Node(preorder[0]);

    for(int i=1;i<n;i++)
    {
     root=insert(root,preorder[i]);
    }
   
return root;
  }

  private static Node insert(Node root, int value) {
   if(root==null) return new Node(value);

   if(value<root.value)
   {
    root.left=insert(root.left,value);
   }
   else
   {
    root.right=insert(root.right,value);
   }
   return root;
  }

  public static void main(String[] args) {
   int [] preorder={8,5,1,7,10,12};
   System.out.println( bstFromPreorder(preorder));
  }

}
