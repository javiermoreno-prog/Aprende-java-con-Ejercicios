import java.util.ArrayList;
import java.util.Collections;

public class ordenacion {
  public static void main(String[] args) {
    ArrayList<Articulo> n=new ArrayList<Articulo>();
    
    n.add(new Articulo(1,"hola",2,3,4));
    n.add(new Articulo(2,"hola",2,3,4));
    n.add(new Articulo(3,"hola",2,3,4));
    
    System.out.println("Gatos: ");
    for(Articulo a:n) {
      System.out.println(a + " ");
    }
    /*pasos para ordenar:
    1.hacer el import del collection
    2.en la clase Articulo ponemos el compareTo():ponemos el
     implements Comparable<Articulo> 
    3.creamos en la clase Articulo el compareTo():
    */
    Collections.sort(n);
    System.out.print(n);
    //fin
  }
}
