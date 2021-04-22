import java.util.HashMap;
import java.util.Map;

public class pruebaHashMap {
 public static void main(String[] args) {
 HashMap<Integer,String> m=new HashMap<Integer,String>();

 m.put(0,"hola");
 m.put(1,"hola");
 
 m.remove(0);
 
 for(Map.Entry pareja: m.entrySet()) {
   System.out.print(pareja.getValue());
 }
 
  //fin
}
}
