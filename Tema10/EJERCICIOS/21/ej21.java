import java.util.HashMap;
import java.util.Map;
public class ej21 {
 public static void main(String[] args) {
   
   HashMap<String,String> habitat=new HashMap<String,String>();
   HashMap<String,String> al=new HashMap<String,String>();
   
   habitat.put("rana","tropicos");
   habitat.put("salamandra","ecosistemas");
   habitat.put("sapo","en todos lados");
   habitat.put("triton","ameria y africa");
   al.put("rana","larvas");
   al.put("salamandra","crustaceos");
   al.put("sapo","insectos");
   al.put("triton","insectos");
   
   System.out.print("Dime el tipo de anfibio: ");
   String n=System.console().readLine();
   
   if(!(habitat.containsKey(n))) {
     System.out.print("No existe");
   } else {
     System.out.println("Habitat: "+habitat.get(n));
     System.out.println("Alimentacion: "+al.get(n));
   }
 
   //fin
 }
}
