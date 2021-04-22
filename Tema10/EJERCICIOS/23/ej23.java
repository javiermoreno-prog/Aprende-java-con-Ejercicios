import java.util.ArrayList;
public class ej23 {
 public static void main(String[] args) {
   ArrayList<Figura> figuras=new ArrayList<Figura>();
   
   figuras.add(new Figura("Dama", 9, 1));
   figuras.add(new Figura("Torre", 5, 2));
   figuras.add(new Figura("Alfil", 3, 2));
   figuras.add(new Figura("Caballo", 2, 2));
   figuras.add(new Figura("Peón", 1, 8));
   
   int totales=(int)(Math.random()*16);
   int captura=0;
   int peones=0;
   
   do {
     // Genera una captura aleatoria
     Figura figuraAux = figuras.get((int) (Math.random() * figuras.size()));
     if (figuraAux.esCapturable()) {
       figuraAux.captura();
       System.out.println(figuraAux);
       captura++;
       peones += figuraAux.getValor();
      }
    } while (captura < totales);
    System.out.println("Puntos totales: " + peones);
   }
  }

/*mejorado
 * import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class pruebas {
  public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  ArrayList<Figura> n = new ArrayList<Figura>();
   n.add(new Figura("Dama", 9, 1));
   n.add(new Figura("Torre", 5, 2));
   n.add(new Figura("Alfil", 3, 2));
   n.add(new Figura("Caballo", 2, 2));
   n.add(new Figura("Peón", 1, 8));


  int cant=(int)(Math.random()*16);
  boolean ok=false;
  Figura b;
  int contador=0;
  
  for(int i=0;i<cant;i++) {
   b=n.get((int)(Math.random()*n.size()));
   
   if(b.getCantidad()>0) {
     System.out.println(b);
     b.setCantidad();
     contador+=b.getValor();
   }
 } 
  //fin
 }
}
* */
