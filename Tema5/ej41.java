import java.util.Scanner;
public class ej41 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();
int contadorPares=0;
int contadorImpares=0;

int m=n;
while(n>0) {
  int digito=n%10;
  if(digito%2==0) {
   contadorPares++;
 } else {
   contadorImpares++;
 }
 n /=10;
}
System.out.println("El " + m + "  contiene " + contadorPares + " digitos pares y " + contadorImpares + " impares");
}
}
