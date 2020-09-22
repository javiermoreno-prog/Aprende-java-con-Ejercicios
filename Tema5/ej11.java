import java.util.Scanner;
public class ej11 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int numero=s.nextInt();

for(int i=0;i<5;i++) {
  System.out.println("-------------------------------");
  System.out.printf("%-7s   %9s  %10s\n","Numero","Cuadrado","Cubo");
  System.out.printf("%-7s   %9s  %10s\n", numero,(numero*numero),(numero*numero*numero));
  numero++;
}
}
}
