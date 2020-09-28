import java.util.Scanner;
public class ej49 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
boolean esPrimo=true;
int minimo=99999;
int maximo=0;
int contador=0;
int suma=0;
System.out.println("Dime numeros para terminar introduzca un numero primo: ");
int numero;
do {
  numero=s.nextInt();
  esPrimo=true;
for(int i=2;i<numero;i++) {
 if(numero%i==0) {
   esPrimo=false;
 }
}
if(!esPrimo) {
  contador++;
  suma+=numero;
  if(numero>maximo) {
    maximo=numero;
  }
  if(numero<minimo) {
    minimo=numero;
  }
}
} while(esPrimo==false);
System.out.println(contador);
System.out.println(maximo);
System.out.println(minimo);
System.out.println(suma/contador);
}
}
