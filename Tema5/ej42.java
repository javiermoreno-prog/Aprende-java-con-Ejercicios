import java.util.Scanner;
public class ej42 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();
boolean esPrimo=true;

for(int i=n;i<n+5;i++) {
  esPrimo = true;
  for(int j=2;j<i;j++) {
    if(i%j==0) {
      esPrimo=false;
    }
  }
  if(esPrimo) {
      System.out.println("El numero es primo");
    } else {
      System.out.println("El numero no es primo");
    }
}
}
}
