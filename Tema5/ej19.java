import java.util.Scanner;
public class ej19 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();
System.out.println("Dime el caracter: ");
String caracter=s.next();
int planta=1;
int linea=1;
int espacios=altura-1;

while(planta<=altura) {
  for(int i=1;i<=espacios;i++) {
    System.out.print(" ");
  }
  for(int i=1;i<=linea;i++) {
    System.out.print(caracter);
  }
  System.out.println();
  planta++;
  linea+=2;
  espacios--;
}
}
}
