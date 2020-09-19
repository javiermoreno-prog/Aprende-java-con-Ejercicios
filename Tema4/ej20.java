import java.util.Scanner;
public class ej20 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
int digito;
System.out.println("dime un numero: ");
int numero=s.nextInt();
boolean esCapicua=false;
digito=numero%10;

if((numero>=0) && (numero<10)) {
  if(digito==numero) {
    esCapicua=true;
 } 
}
 if((numero>=10) && (numero<100)) {
  int primer=numero/10;
  if(digito==primer) {
    esCapicua=true;
  }
 }
 
 if((numero>=100) && (numero<1000)) {
   int primer=numero/100;
    if(digito==primer) {
    esCapicua=true;
  }
 }
 if((numero>=1000) && (numero<10000)) {
   int primer=numero/1000;
    if(digito==primer) {
    esCapicua=true;
  }
 }
 if((numero>=10000) && (numero<100000)) {
   int primer=numero/10000;
    if(digito==primer) {
    esCapicua=true;
  }
 }
 if(esCapicua==true) {
   System.out.println("\033[32m el numero es capicua");
 } else {
   System.out.println("\033[34m el numero no es capicua");
 }
}
}
