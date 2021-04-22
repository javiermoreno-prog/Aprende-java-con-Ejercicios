import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class ej12 {
  public static void main(String[] args) {
    
  HashMap<String,Integer> m=new HashMap<String,Integer>();
  ArrayList<Carta> n=new ArrayList<Carta>();
  int suma=0;
  
  m.put("as", 11);
  m.put("dos", 0);
  m.put("tres", 10);
  m.put("cuatro", 0);
  m.put("cinco", 0);
  m.put("seis", 0);
  m.put("siete", 0);
  m.put("sota", 2);
  m.put("caballo", 3);
  m.put("rey", 4);
  
  for(int i=0;i<5;i++) {
    n.add(new Carta());
    suma+=m.get(n.get(i).getNum());
    System.out.println(n.get(i));
  }
  System.out.println();
  System.out.print("El resultado es: "+suma);
    //fin
  }
}
