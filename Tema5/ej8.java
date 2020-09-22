import java.util.Scanner;
public class ej8 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero y te doy su tabla de multiplicar: ");
int numero=s.nextInt();

for(int i=0;i<10;i++) {
  System.out.println(numero + " x "+ i + " = " + (numero*i));
}
}
}
