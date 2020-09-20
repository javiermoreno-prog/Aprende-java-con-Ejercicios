import java.util.Scanner;
public class ej25 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
System.out.println("Introduzca la altura de la bandera en cm: ");
double altura=s.nextInt();
System.out.println("Ahora introduzca la anchura: ");
double anchura=s.nextInt();
double cm=(anchura*altura)/100;
System.out.println("¿Quiere escudo bordado? (s/n): ");
String escudo=s.next();
double gastoEscudo=0;
if(escudo.equals("s")) {
 gastoEscudo=2.50;
} 

System.out.println("Gracias. Aquí tiene el desglose de su compra.");
System.out.println("Bandera de "+(altura*anchura) +"cm: "+ cm + "euros");
if(escudo.equals("s")) {
  System.out.println("Con escudo: 2.50");
} else {
  System.out.println("Sin escudo: 0,00 €");
}
System.out.println("Gastos de envio: 3.25");
System.out.println("Total:   "+(cm+gastoEscudo+3.25));
}
}
