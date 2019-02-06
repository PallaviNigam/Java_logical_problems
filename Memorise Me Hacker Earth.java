import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String str;
      int N = sc.nextInt();
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for(int i=0;i<N;i++)
    {
        int no = sc.nextInt();
       if ( hm.containsKey(no) == true)
       {
          hm.put(no, (hm.get(no)+1) );
       }
       else
       {
           hm.put(no, 1 );
       }
    }
    
N = sc.nextInt();
for(int i=0;i<N;i++)
{
    int no = sc.nextInt();
     if ( hm.containsKey(no) == true)
     {
       System.out.println(  hm.get(no));
     }
     else
     {
            System.out.println( "NOT PRESENT");
     }
}
    }  
}
