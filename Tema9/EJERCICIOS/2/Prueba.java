import java.util.Scanner;
public class Prueba {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

  Coche n=new Coche(12);
  Bicicleta b=new Bicicleta(9);
  
  int opcion=0;
  boolean salir=false;
  int cantidad=0;
 
 do {
 System.out.println("VEHICULOS");
 System.out.println("==========");
 System.out.println("1.Anda con la bicicleta");
 System.out.println("2.Haz el caballito con la bicicleta");
 System.out.println("3.Anda con el coche");
 System.out.println("4.Ver kilometraje de la bici");
 System.out.println("5.Ver kilometraje del coche");
 System.out.println("6.Ver kilometraje total");
 System.out.println("7.Salir");
 System.out.println("Elije opcion: ");
 opcion=s.nextInt();
 
 switch(opcion) {
   case 1:
   System.out.println("Dime cantidad: ");
   cantidad=s.nextInt();
   b.andar(cantidad);
   System.out.println("");
     
   break;
   case 2:
   b.caballito();
   System.out.println();
   
   break;
   case 3:
   System.out.println("Dime cantidad: ");
   cantidad=s.nextInt();
   n.andar(cantidad);
   System.out.println("");
   break;
   case 4:
      System.out.println(b.getKloca());
      System.out.println();
   break;
   case 5:
   System.out.println(n.getKlocal());
        System.out.println("");
   break;
   case 6:
   System.out.println(n.getKilometrosTotales());
        System.out.println("");
   break;
   case 7:
   salir=true;
   break;
   default:
 }
}while(salir==false);
  //fin
}
}
