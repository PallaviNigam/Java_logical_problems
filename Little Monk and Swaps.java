import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
class Tree
{
    int[] tree;
//Inoder Travesal of entred Tree
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//Inoder Travesal of Binary Search Tree
TreeSet<Integer> ts = new TreeSet<Integer>();
int n = 0;
int index = 0;
int swap = 0;
int[] inordertree;
   public void inorderTraversal()
   {
       index = 0;
       traverseNode(0);
     
   }
     public void traverseNode(int nodeindex)
     {
         if (2*nodeindex+1 < n)
         {
             traverseNode(2*nodeindex+1);
         }
         inordertree[index] = tree[nodeindex];
         hm.put(tree[nodeindex],index);
      //    System.out.println(tree[nodeindex] + "added to index" + index);
         index++;
         if (2*nodeindex+2 < n)
         {
             traverseNode(2*nodeindex+2);
         }
     }
     public void calculateSwap()
     {
         
         
         Iterator itr  = ts.iterator();
//  Iterator<Map.Entry<Integer, Integer>> itr1 = hm.entrySet().iterator(); 
         int i = 0;
         while(itr.hasNext())
         {
             int n1 = (int)itr.next();
                int n2 = inordertree[i];
                 
             if (n1 == n2)
             {
                 i++;
             }
             else
             {
                int strkey = hm.get(n1);
                hm.put( n2, strkey);
                hm.put(n1, i);
                  /*for(Map.Entry entry: hm.entrySet()){
            if(n1 == (int)entry.getValue()){
                int strkey = (int)entry.getKey();
                hm.put(i,n1);
                hm.put(strkey, n2);*/
               // System.out.println("Swap"+ n1 + n2);
               inordertree[i] = n1;
                 inordertree[strkey] = n2;
                swap++;
                i++;
               // break; //breaking because its one to one map
            
        
             }
             
         }
         System.out.println(swap);
     }
}


public class MyClass {
    public static void main(String args[]) throws Exception {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Tree t = new Tree();
      t.n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      t.tree = new int[t.n];
          t.inordertree = new int[t.n];
      for(int i = 0; i<t.n; i++)
      {
          t.tree[i] = Integer.parseInt(str[i]);
          t.ts.add(t.tree[i]);
         //  System.out.println(t.tree[i]);
          
      }
     // System.out.println(t.ts);
      t.inorderTraversal();
      t.calculateSwap();
    }
}
