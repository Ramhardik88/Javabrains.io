package Trie;

import java.util.HashMap;
import java.util.Map;

public class Trie
{

    private class TrieNode
    {
        Map<Character,TrieNode> childern;
        boolean endOfWord;
        public TrieNode()
        {
            childern=new HashMap<>();
            endOfWord=false;
        }
    }

    private  final TrieNode root;

    public Trie()
    {
        root= new TrieNode();
    }

    //Insert method iterative
    public void insert(String word)
    {
        TrieNode current=root;

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            TrieNode node =current.childern.get(ch);
            if(node==null)
            {
                node = new TrieNode();
                current.childern.put(ch,node);
            }
            current=node;

        }
        current.endOfWord=true;

    }
    public void insertIterative(String word)
    {
        insertIterative(root,word,0);
    }

    private void insertIterative(TrieNode current, String word, int index) {
        if(index==word.length())
        {
            current.endOfWord= true;
            return ;
        }
        char ch=word.charAt(index);
        TrieNode node =current.childern.get(ch);
        if(node==null)
        {
            node = new TrieNode();
            current.childern.put(ch,node);
        }
        insertIterative(node,word,index+1);
    }

    public boolean search(String word)
    {
        TrieNode current=root;

        for(int i=0;i<word.length();i++)
        {
            char ch= word.charAt(i);
            TrieNode node =current.childern.get(ch);
            if(node==null)
            {
                return false;
            }
            current=node;
        }
        return current.endOfWord;

    }
    public boolean searchRecursive(String word)
    {
       return searchRecursive(root,word,0);
    }
    public boolean searchRecursive(TrieNode current,String word,int index) {
        if (index == word.length()) {
             return current.endOfWord;

        }
        char ch= word.charAt(index);
        TrieNode node=current.childern.get(ch);
        if(node==null)
        {
            return false;
        }

      return searchRecursive(node,word,index+1);
    }
 public void delete(String word)
 {
     delete(root,word,0);
 }
 public boolean delete(TrieNode current,String word,int index)
 {
     if(index==word.length())
     {
         if(!current.endOfWord)
         {
             return false;
         }
         current.endOfWord=false;

         return current.childern.size()==0;
     }
     char ch=word.charAt(index);
     TrieNode node=current.childern.get(ch);
     if(node==null)
     {
         return false;
     }
     boolean shoulddeletecurrentnode=delete(node,word,index+1);
     if(shoulddeletecurrentnode)
     {
         current.childern.remove(ch);

         return current.childern.size()==0;
     }
     return false;
 }



    public static void main(String[] args) {
        Trie trie= new Trie();
        trie.insertIterative("abc");
        System.out.println( trie.searchRecursive("abc"));
    }


}
