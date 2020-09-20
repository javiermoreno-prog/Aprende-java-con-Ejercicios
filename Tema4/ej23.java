import java.util.Scanner;
public class ej23 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("Introduzca la base imponible:");
 int baseImponible=s.nextInt();
 System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
 String tipo=s.next();
 double iva=0;
 switch(tipo) {
   case "general":
   iva=1.21;
   break;
   case "reducido":
   iva=1.10;
   break;
   case "superreducido":
   iva=1.04;
   break;
   default:
 }
 double total=baseImponible*iva;
 
 System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
 String codigo=s.next();
 switch(codigo) {
   case "nopro":
   total=total;
   break;
   case "mitad":
   total=total/2;
   break;
   case "meno5":
   total=total-5;
   break;
   case "5porc":
   total=total*0.95;
   break;
   default:
 }
 
 System.out.println("Base imponible               "+baseImponible);
 System.out.println("IVA                          "+(baseImponible-(baseImponible/iva)));
 System.out.println("Precio con IVA               "+baseImponible*iva);
 System.out.println("Cod promo                    "+codigo);
 System.out.println("TOTAL                        "+total);
}
}
