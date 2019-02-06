import java.util.*;
public class SearchForSum
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    int no = 0;
    boolean flag = false;
    int k  = sc.nextInt();
    int[] arr = new int[n];
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    for(i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
        no = k-arr[i];
    flag = hm.containsKey(no);
    if (flag == true)
    {
     hm.put(no, (hm.get(no) + 1));
    }
    else
    {
        hm.put(no,1);
    }
  flag = false;
    }
    
    
    flag = false;
     for(i=0;i<n;i++)
     {
         no = k-arr[i];
           if  (hm.containsKey(no) == true)
           {
         if (no == arr[i])
         {
             
             if  ( hm.get(no) >= 2)
             {
                 flag = true;
                 break;
             }
         }
         else
         {
          if  ( hm.get(no) >= 1)  
          {
           flag = true;
                 break;
          }
         }
           }
     }
     if (flag == true)
     {
         System.out.println("YES");
     }
     else
     {
         System.out.println("NO");
     }
    }
}

