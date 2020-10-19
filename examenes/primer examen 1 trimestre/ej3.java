import java.util.Scanner;
public class ej3 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Este programa da vueltas a un numero");
System.out.println("Introduzca un numero: ");
int n=s.nextInt();
System.out.println("Introduzca el tipo de desplazamiento: ");
String d=s.next();
System.out.println("Introduzca el numero de cifras: ");
int cifras=s.nextInt();


switch(d) {
  case "izquierda":
  int copiaIzq=n;
  int volteado=0;
  while(copiaIzq>0) {
   volteado  =(volteado*10)+(copiaIzq%10);
    copiaIzq/=10;
  }
  int potencia=1;
   int resto=0;
  for(int i=1;i<=cifras;i++) {
    potencia*=10;
  }
  resto=volteado%potencia;
  int copiaResto=resto;
  
 int vresto=0;
  while(copiaResto>0) {
    vresto=(vresto*10)+(copiaResto%10);
    copiaResto/=10;
  }
  
  int copia2=volteado-resto;
  int volteado2=0;
  while(copia2>0) {
    volteado2=(volteado2*10)+(copia2%10);
    copia2/=10;
  }
  int resultado=(volteado2*potencia)+vresto;
 System.out.println(volteado);
 System.out.println(potencia);
 System.out.println(resto);

 System.out.println(copia2);
 System.out.println(volteado2);
System.out.println(resultado); 
 
 break;
 case "derecha":
 int restoDerecha=0;
 int copiaDerecha=n;
 int DivisorResto=1;
 int copiaDerecha2=n;
 int longitud=0;
 

 for(int i=1;i<=cifras;i++) {
   DivisorResto*=10;
 }
   restoDerecha=copiaDerecha%DivisorResto;

   copiaDerecha=copiaDerecha-restoDerecha;
   copiaDerecha/=DivisorResto;
  
  int copiaDecopia=copiaDerecha;
  // longitud 
  while(copiaDecopia>0) {
   copiaDecopia/=10;
   longitud++;
 }
   int multiplicador=1;
   for(int i=1;i<=longitud;i++) {
     multiplicador*=10;
   }
   
  
 System.out.println(multiplicador*restoDerecha);
 System.out.println(copiaDerecha);
 System.out.println(copiaDerecha+(multiplicador*restoDerecha));
 

   
 break;
 default:
}
}
}
