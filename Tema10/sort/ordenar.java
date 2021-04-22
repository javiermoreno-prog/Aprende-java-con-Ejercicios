import java.util.ArrayList;
import java.util.Collections;
public class ordenar {
  public static void main(String[] args) {
    ArrayList<Persona> n=new ArrayList<Persona>();
    
    n.add(new Persona("hola",3));
    n.add(new Persona("you",3));
    n.add(new Persona("al",3));
    
     System.out.println(n);
    Collections.sort(n);
    System.out.println(n);
    //fin
  }
}
