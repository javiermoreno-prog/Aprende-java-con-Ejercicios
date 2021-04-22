import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ej05 {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  ArrayList<Disco> n=new ArrayList<Disco>();
  boolean salir=false;
  int opcion=0;
  String c,a,t,g;
  int d=0;
  
  do {
     System.out.println("Que quieres hacer: ");
     System.out.println("1. Listado");
     System.out.println("2. Nuevo disco");
     System.out.println("3. Modificar");
     System.out.println("4. Borrar");
     System.out.println("5. Salir");
     System.out.print("Introduzca una opción: ");
     opcion=s.nextInt();
     switch(opcion) {
     case 1:
     for(Disco q:n) {
       System.out.println(q);
      }
      break;
      case 2:
        System.out.println("Dime codigo: ");
       c=s.next();
       System.out.println("Dime autor: ");
       a=s.next();
       System.out.println("Dime titulo: ");
       t=s.next();
       System.out.println("Dime genero: ");
       g=s.next();
       System.out.println("Dime duracion: ");
       d=s.nextInt();
      n.add(new Disco(c,a,t,g,d));
      break;
      case 3:
       System.out.println("Dime el disco que quieres cambiar: ");
       opcion=s.nextInt();
        System.out.println("Dime codigo: ");
       c=s.next();
       System.out.println("Dime autor: ");
       a=s.next();
       System.out.println("Dime titulo: ");
       t=s.next();
       System.out.println("Dime genero: ");
       g=s.next();
       System.out.println("Dime duracion: ");
       d=s.nextInt();
       n.remove(opcion);
       n.add(opcion,new Disco(c,a,t,g,d));
       break;
       case 4:
        System.out.println("Dime el disco que quieres borrar: ");
       opcion=s.nextInt();
       n.remove(opcion);
       break;
       case 5:
       salir=true;
       break;
      default:
    }
  } while(salir==false);

  //fin
}
}
