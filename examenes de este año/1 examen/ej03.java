import java.util.Scanner;
public class ej03 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
//javier moreno aguilera
double p4=0;
double p10=0;
double p21=0;
double descIva=0;
float ivacien=0;
//usadas en el while
double total=0;
String n="";
double p=0;
int c=0;
int iva=0;
double baseImponible=0;
int contador=1;

do {
System.out.println("Introduzca nombre del artículo"+contador+" ('fin' para salir): ");
n=s.next();
System.out.println("Precio por unidad para Articulo"+contador+" (IVA incluido): ");
if(n.equals("salir")) {
  p=0;
} else {
p=s.nextDouble();
}
System.out.println("Cantidad de unidades de Articulo"+contador+": ");
if(n.equals("salir")) {
  c=0;
} else {
 c=s.nextInt();
}
System.out.println("Tipo de IVA aplicado a Articulo"+contador+" (4,10,21): ");
if(n.equals("salir")) {
  iva=0;
} else {
iva=s.nextInt();
baseImponible=(c*p);
descIva=c*p;
total+=p*c;
if(iva==4) {
  p4+=baseImponible;
  iva=4;
} else if (iva==10) {
  p10+=baseImponible;
} else {
  p21+=baseImponible;
}
}
contador++;
//iva=base(porcentaje)*precio-precio;
}while(!n.equals("salir"));

//factura
System.out.printf("%-4s %20.2f","TOTAL",total);
System.out.println();
System.out.print("------------------------------------------");
System.out.println();
iva=4;
System.out.printf("%-9s %-8.2f %-3s %-8.2f","Base Imponible : ",(p4*((100-iva)*0.01)),"IVA: ",(p4-p4*((100-iva)*0.01)));
iva=10;
System.out.println();
System.out.printf("%-9s %-8.2f %-3s %-8.2f","Base Imponible : ",(p10*((100-iva)*0.01)),"IVA: ",(p10-p10*((100-iva)*0.01)));
iva=21;
System.out.println();
System.out.printf("%-9s %-8.2f %-3s %-8.2f","Base Imponible : ",(p21*((100-iva)*0.01)),"IVA: ",(p21-p21*((100-iva)*0.01)));
///fin del programa
}
}
