import java.util.Scanner;
public class ej23 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int suma=0;
System.out.println("Dime un numero: ");
int contador=0;
int numero;
do {
numero=s.nextInt();
suma+=numero;  
contador++;
} while(suma<10000);

System.out.println("Total acumulado: "+suma);
System.out.println("Contador: "+contador);
System.out.println("Media: "+(suma/contador));
}
}
