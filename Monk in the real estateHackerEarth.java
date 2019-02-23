import java.io.*;
import java.util.*;

/*class Graph
{
    private int n;
    private int[][] e;
    Graph(int n)
    {
        this.n = n;
        e = new int[n-1][n-1];
    }
    
    public void addEdge(int n1, int n2, int w)
    {
        e[n1-1][n2-1] = w;
        e[n2-1][n1-1] = w;
        
    }
    
    public void test(int n1, int n2, int w)
    {
        for(int i=0;i<n;i++)
        {
            if(e[n1-1][i] > w || e[n2-1][i] > w)
            {
                System.out.println("YES");
                return;
            }
        }
         System.out.println("NO");
    }
}*/
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Integer,Integer> hm ;
      for(int i=0;i<t;i++)
      {
          hm = new HashMap<Integer,Integer>();
          int edges = sc.nextInt();
          int sum=0;
          for(int j = 0;j<edges;j++)
          {
              int n1 = sc.nextInt();
              int n2 = sc.nextInt();
              if (hm.containsKey(n1) == false)
              {
                  hm.put(n1,1);
                  sum++;
              }
               if (hm.containsKey(n2) == false)
              {
                  hm.put(n2,1);
                  sum++;
              }
          }
          System.out.println(sum);
          sum = 0;
      }
        }
}
