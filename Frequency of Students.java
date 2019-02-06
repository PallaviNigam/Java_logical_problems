import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String str;
      int N = sc.nextInt();
     TreeMap<String,Integer> tm = new TreeMap<String, Integer>();
      int i;
      sc.nextLine();
      for(i=0;i<N;i++)
      {
          str = sc.nextLine();
         if  (tm.containsKey(str) == true)
         {
         tm.put( str,  ( tm.get(str) + 1) );
         }
         else
         {
               tm.put( str,  1 );
         }
      }
     for(Map.Entry<String,Integer> entry : tm.entrySet()) {
  String key = entry.getKey();
  Integer value = entry.getValue();

  System.out.println(key + " " + value);
}
    }
}
