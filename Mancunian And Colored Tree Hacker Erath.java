import java.io.*;
public class MyClass {
    public static void main(String args[]) throws Exception {
    int[] a;
    int[] c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        a = new int[n];
        c = new int[n+1];
       // System.out.println(n+m);
        int i;
        str = br.readLine().split(" ");
        for (i = 1;i<n;i++)
        {
           a[i] =  Integer.parseInt(str[i-1]);
          // System.out.println(a[i]);
        }
        str = br.readLine().split(" ");
         for (i = 1;i<=n;i++)
        {
           c[i] =  Integer.parseInt(str[i-1]);
          // System.out.println(c[i]);
        }
        // System.out.println("Start");
         System.out.print("-1"+ " ");
         int j , color, parent;
         int found = 0;
         for(i = 2; i<=n; i++)
         {
             color = c[i];
             j = i;
             while(j!=1)
             {
                 parent = a[j-1];
                 if (c[parent] == color)
                 {
                     System.out.print(parent + " ");
                     found = 1;
                     break;
                 }
                 j = parent;
                 
             }
             if (found == 0)
             {
                    System.out.print("-1" + " ");
             }
             found = 0;
         }
    }
}
Language: Java
