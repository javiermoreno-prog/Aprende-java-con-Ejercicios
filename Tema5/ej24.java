import java.util.Scanner;
public class ej24 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();
int planta=1;
int espacios=altura-1;
int linea=1;

while(planta<altura) {
  for(int i=0;i<espacios;i++) {
    System.out.print(" ");
  }
  for(int i=1;i<=linea;i++) {
    System.out.print(i); 
  }
  if(planta>1) {
    for(int i=linea-1;i>0;i--) {
      System.out.print(i);
    }
  }
  System.out.println();
  linea++;
  espacios--;
  planta++;
}
}
} 
