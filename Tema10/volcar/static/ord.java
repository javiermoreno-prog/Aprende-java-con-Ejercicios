import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
public class ord {
  public static void main(String[] args) {
    ArrayList<Persona> n=new ArrayList<Persona>();
    n.add(new Persona("c"));
    n.add(new Persona("a"));
    n.add(new Persona("b"));
    
    System.out.println(n);
    Collections.sort(n);
    System.out.println(n);
    
    Persona.aniadir("o",3);
    Persona.mostrar();
    //Fin
  }
}
