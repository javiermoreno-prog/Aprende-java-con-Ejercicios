import java.util.HashMap;
import java.util.Map;
public class ej19 {
 public static void main(String[] args) {
   HashMap<String,String> m=new HashMap<String,String>();
   
   m.put("caliente","hot");
   m.put("rojo","red");
   m.put("ardiente","hot");
   m.put("verde","green");
   m.put("agujetas","stiff");
   m.put("abrasador","hot");
   m.put("hierro","iron");
   m.put("grande","big");
  
  String opcion="";
  int contador=0;
  
  do {
  System.out.println("Dime palabra: ");  
  opcion=System.console().readLine();
  contador=0;
  
  //la palabra no existe
  if(!(m.containsKey(opcion))) {
    System.out.println("No conozco esa palabra: ");
  } else {
    //la palabra existe
     for (Map.Entry entrada : m.entrySet()) {
      if (entrada.getValue().equals(m.get(opcion))) {
        contador++;
       }
     }

     //si la palabra no tiene sinonimos
    if(contador==1) {
      System.out.println("No conozco sinonimos de esa palabra");
    } else {
       for (Map.Entry entrada : m.entrySet()) {
      if (entrada.getValue().equals(m.get(opcion))) {
         System.out.print(entrada.getKey() + " ");
       }
     }
   }
}   
}while(!(opcion.equals("salir")));

//fin
}
}
