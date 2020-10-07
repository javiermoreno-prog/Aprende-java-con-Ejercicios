import java.util.Scanner;
public class ej58 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();
double contador=0;
double suma=0;

int copia=n;
 int digito=0;
 
while(copia>0) {
 digito=copia%10;
 suma+=digito;
 contador++;
  copia /=10;
}
System.out.println("La media de sus dígitos es: "+(suma/contador));
}
}
