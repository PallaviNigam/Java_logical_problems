import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) throws IOException {
       //Scanner sc = new Scanner(System.in);
      BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
       String str;
      int N = Integer.parseInt(br.readLine());
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
     String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
  
    for(int i=0;i<N;i++)
    {
        int no = Integer.parseInt(strs[i]);
       if ( hm.containsKey(no) == true)
       {
          hm.put(no, (hm.get(no)+1) );
       }
       else
       {
           hm.put(no, 1 );
       }
    }
    
N = Integer.parseInt(br.readLine());
for(int i=0;i<N;i++)
{
    int no = Integer.parseInt(br.readLine());
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
