import java.util.HashMap;
import java.util.Map;
public class ej10 {
 public static void main(String[] args) {
  HashMap<String,String> m=new HashMap<String,String>();
  
  String[] e={"a","b","c","d","e","f","g"};
  String[] n={"h","i","j","k","l","m","n"};
  
  for(int i=0;i<e.length;i++) {
    m.put(e[i],n[i]);
  }
  
  System.out.print("Dime palabra: ");
  String v=System.console().readLine();
  
  System.out.print("Español: "+ v + ",Ingles: "+m.get(v));
  //fin
 }
}
