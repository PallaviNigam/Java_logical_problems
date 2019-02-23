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
        int n = sc.nextInt();
        int degree_to_be_tree = (n-1)*2;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
          sum = sum+  sc.nextInt();
            
        }
        
        if(sum> degree_to_be_tree)
        {
            System.out.println("No");
        }
        else
        {
               System.out.println("Yes");
        }
   
        }
}
