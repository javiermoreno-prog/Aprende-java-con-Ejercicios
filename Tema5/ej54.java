import java.util.Scanner;
public class ej54 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Introduzca la altura de la figura: ");
int altura=s.nextInt();
int planta=1;
int espacios=altura-2;

for(int i=0;i<altura;i++) {
    System.out.print("*");
  }
  System.out.println();
  
while(planta<=altura-1) {
  System.out.print("*");
  for(int i=1;i<espacios;i++) {
    System.out.print(" ");
  }
  if(planta<altura-1) {
    System.out.print("*");
  }
  System.out.println();
  planta++;
  espacios--;
}
}
}
