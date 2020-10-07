import java.util.Scanner;
public class ej67 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Introduzca el número de escalones: ");
int numero=s.nextInt();
System.out.println("Introduzca la altura de cada escalón: ");
int altura=s.nextInt();
int copia=altura;
int copia2=numero;
int contador=0;
int copia3=copia2;

while(contador<copia2) {
    for(int j=1;j<=copia;j++) {
    for(int i=1;i<=copia3;i++) {
      System.out.print("*");
    }
    System.out.println();
  }
   contador++;
  copia3+=numero;
}
}
}
