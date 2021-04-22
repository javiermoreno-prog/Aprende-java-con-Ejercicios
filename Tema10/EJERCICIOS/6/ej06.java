import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ej06 {
 public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   HashMap<String,String> m=new HashMap<String,String>();
   m.put("u","u");
   boolean salir=false;
   int oportunidades=3;
   String in="";
   String in2="";
   do {
     System.out.println("Dime usuario: ");
     in=s.next();
     System.out.println("Dime contraseña: ");
     in2=s.next();
     oportunidades--;
     if(oportunidades>=0) {
       if(m.containsKey(in)==true) {
         if(m.get(in).equals(in2)) {
           System.out.println("Has accedido");
           salir=true;
         } else {
           System.out.println("Usuario correcto pero contraseña no");
         }
       } else {
         System.out.println("no");
       }
     } else {
       salir=true;
     }
   } while(salir==false);
   
   
   //fin
 }
}
