import java.util.ArrayList;
import java.util.Scanner;
public class ej13 {
  public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   ArrayList<Articulo> n=new ArrayList<Articulo>();
   boolean salir=false;
   int opcion=0;
   int codigo,pre,vent,stock;
   String des;
   int cantidad;
   String ok="";
   
   do {
    System.out.println("1.Listado.");
    System.out.println("2.Alta.");
    System.out.println("3.Baja.");
    System.out.println("4.Modificacion.");
    System.out.println("5.Entrada");
    System.out.println("6.Salida");
    System.out.println("7.Salir");
    System.out.println("Dime opcion: ");
    opcion=s.nextInt();
    
    switch(opcion) {
      case 1:
      System.out.println(n);
      break;
      case 2:
       System.out.print("Dime codigo: ");
        codigo=Integer.parseInt(System.console().readLine());
        System.out.print("Dime descrip: ");
        des=System.console().readLine();
         System.out.print("Dime precio: ");
         pre=Integer.parseInt(System.console().readLine());
         System.out.print("Dime venta: ");
        vent=Integer.parseInt(System.console().readLine());
         System.out.print("Dime stock: ");
        stock=Integer.parseInt(System.console().readLine());
        n.add(new Articulo(codigo,des,pre,vent,stock));
        break;
        case 3:
        System.out.print("Dime codigo: ");
        codigo=Integer.parseInt(System.console().readLine());
        for(int i=0;i<n.size();i++) {
          if(n.get(i).getCodigo()==codigo) {
            n.remove(i);
          }
        }
        break;
        case 4:
        System.out.print("Dime codigo: ");
        codigo=Integer.parseInt(System.console().readLine());
        System.out.print("Dime descrip: ");
        des=System.console().readLine();
         System.out.print("Dime precio: ");
         pre=Integer.parseInt(System.console().readLine());
         System.out.print("Dime venta: ");
        vent=Integer.parseInt(System.console().readLine());
         System.out.print("Dime stock: ");
        stock=Integer.parseInt(System.console().readLine());
         for(int i=0;i<n.size();i++) {
          if(n.get(i).getCodigo()==codigo) {
            n.remove(i);
          }
        }
        n.add(new Articulo(codigo,des,pre,vent,stock));
        break;
        case 5:
        System.out.print("Dime codigo: ");
        codigo=Integer.parseInt(System.console().readLine());
        System.out.println("Dime cantidad: ");
        cantidad=Integer.parseInt(System.console().readLine());
         n.get(codigo).setStock(cantidad);
         break;
         case 6:
         do {
            System.out.print("Dime codigo: ");
            codigo=Integer.parseInt(System.console().readLine());
             System.out.print("Dime cantidad: ");
            cantidad=Integer.parseInt(System.console().readLine()); 
            n.get(codigo).setStock(-cantidad);
         } while(codigo!=99);
         break;
         case 7:
         salir=true;
         break;
      default:
    }
   } while(salir==false);
    //fin
  }
}
