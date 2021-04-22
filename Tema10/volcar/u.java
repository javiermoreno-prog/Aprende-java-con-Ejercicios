import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class u {
  public static void main(String[] args) {
    HashMap<String,String> m=new HashMap<String,String>();
    /*formas de ordenar:
     * 1.ordenacion de keys a traves de constructor
     * 2.ordenacion maxima con Strings
     * 3.ordenacion maxima con cualquier tipo de dato*/
  
    m.put("e","0");
    m.put("a","1");
    m.put("q","2");
    
    /*1
     ArrayList<String> n=new ArrayList<String>(m.keySet());
     System.out.print(n);
     * */
     /*2*/
      ArrayList<String> n=new ArrayList<String>();
       for(String a:m.keySet()) {
       n.add(a);
     }
     System.out.print(n);
    /*3
    int e=0;
    
    ArrayList<Integer> n=new ArrayList<Integer>();
    
    for(Map.Entry pareja:m.entrySet()) {
    //n.add(pareja.getValue());
    e=(int)pareja.getValue();
    n.add(e);
  }
  
  System.out.print(n);
  * */
    //fin
  }
}
