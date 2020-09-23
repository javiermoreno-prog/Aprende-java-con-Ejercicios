import java.util.Scanner;
public class ej27 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();
int contador=0;
int suma=0;

for(int i=1;i<n;i+=3) {
  System.out.println(i);
  contador++;
  suma+=i;
}
System.out.println("El numero de multiplos: "+contador);
System.out.println("La suma: "+suma);
}
}

