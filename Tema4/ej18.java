import java.util.Scanner;
public class ej18 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 
 System.out.println("Dime un numero: ");
 int numero=s.nextInt();
 
 if((numero>=0) && (numero<10)) {
   System.out.println("El numero tiene 1 cifra");
 } 
 if((numero>=10) && (numero<100)) {
   System.out.println("El numero tiene 2 cifras");
 }
 if((numero>=100) && (numero<1000)) {
   System.out.println("El numero tiene 3 cifras");
 }
 if((numero>=1000) && (numero<10000)) {
   System.out.println("El numero tiene 4 cifras");
 }
 if((numero>=10000) && (numero<100000)) {
   System.out.println("El numero tiene 5 cifras");
 }
}
}

 
 
