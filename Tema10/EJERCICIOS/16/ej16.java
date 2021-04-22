import java.util.Scanner;
import java.util.HashMap;
public class ej16 {
 public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
  HashMap<String,String> m=new HashMap<String,String>();
  
  m.put("España","Madrid");
  m.put("Portugal","Lisboa");
  m.put("Francia","Paris");
  
  String opcion="";
  String capital="";
  
  do {
  System.out.println("Dime pais y te dire capital: ");
  opcion=s.next();  
  
  if(m.containsKey(opcion)==true) {
    System.out.println("La capital de "+ opcion + " es "+ m.get(opcion));
  } else {
    System.out.println("No la conozco,me la dices: ");
    capital=s.next();
    m.put(opcion,capital);
  }
  
  } while(!(opcion.equals("salir")));
  
  //fin
 }
}
