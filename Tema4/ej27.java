import java.util.Scanner;
public class ej27 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
  System.out.println("Elija un sabor (manzana, fresa o chocolate): ");
  String sabor=s.next();
  double precio=0;
  double precioNata=0;
  double precioNombre=0;
  
  switch(sabor) {
    case "manzana":
    precio=18;
    break;
    case "fresa":
    precio=16;
    break;
    case "chocolate":
    System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco): ");
    String opcion=s.next();
    if(opcion.equals("negro")) {
      precio=14;
    } else {
      precio=15;
    }
    default:
   
  }
  System.out.println("¿Quieres nata?: ");
  String nata=s.next();
  if(nata.equals("s")) {
    precioNata+=2.50;
  }
  System.out.println("¿Quieres ponerle un nombre?: ");
  String nombre=s.next();
  if(nombre.equals("s")) {
    precioNombre+=2.75;
  }
  System.out.println("Tarta de "+sabor+ ": "+precio);
  System.out.println("Nata: "+precioNata);
  System.out.println("Nombre: "+precioNombre);
  System.out.println("Total: "+(precio+precioNata+precioNombre));
}
}

  
