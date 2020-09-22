import java.util.Scanner;
public class ej16 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("dime un numero y te digo si es primo o no: ");
int numero=s.nextInt();
boolean esPrimo=true;

for(int i=2;i<numero;i++) {
  if((numero % i)==0) {
    esPrimo=false;
  }
}
  if(esPrimo) {
    System.out.println("el numero es primo");
  } else {
    System.out.println("el numero no es primo");
  }
}
}

