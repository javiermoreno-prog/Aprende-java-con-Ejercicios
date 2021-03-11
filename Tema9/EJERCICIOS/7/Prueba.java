import java.util.Scanner;
public class Prueba {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
Zona principal=new Zona(1000);
Zona compraVenta=new Zona(200);
Zona vip=new Zona(25);

boolean salir=false;
int opcion=0;
int zona=0;
int cantidad=0;
do {
  
  System.out.println("Mostrar numero de entradas libres");
  System.out.println("Vender entradas");
  System.out.println("Salir");
  opcion=s.nextInt();
  
  switch(opcion) {
    case 1:
    System.out.println("De que zona quieres ver el numero: ");
      zona=s.nextInt();
      switch(zona) {
        case 1:
        System.out.println(principal.getEntradasPorVender());
        break;
        case 2:
        System.out.println(compraVenta.getEntradasPorVender());
        break;
        case 3:
        System.out.println(vip.getEntradasPorVender());
        break;
        default:
      }
      break;
      case 2:
      System.out.println("De que zona quieres ver el numero: ");
      zona=s.nextInt();
       System.out.println("Cantidad: ");
        cantidad=s.nextInt();
         switch(zona) {
        case 1:
        principal.vender(cantidad);
        break;
        case 2:
        compraVenta.vender(cantidad);
        break;
        case 3:
        vip.vender(cantidad);
        break;
        default:
      }
      
       break;
       case 3:
       salir=true;
      break;
      default:
     }
} while(salir==false);

//fin
}
}
