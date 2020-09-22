import java.util.Scanner;
public class ej15 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("dime una base: ");
int numero=s.nextInt();
System.out.println("dime el exponente: ");
int exponente=s.nextInt();
int potencia=1;

for(int i=0;i<exponente;i++) {
  potencia*=numero;
  System.out.print(potencia + " ");
}
}
}
