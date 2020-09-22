import java.util.Scanner;
public class ej10 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int numero;
int suma=0;
int contador=0;

do {
System.out.println("numero: ");
numero=s.nextInt();
if(numero>0) {
  suma+=numero;
  contador++;
} else {

}
}while(numero>0);
System.out.print("La media es: "+(suma/contador));
}
}
