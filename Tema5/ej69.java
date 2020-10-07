import java.util.Scanner;
public class ej69 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();
int planta=1;
int espacios=altura;
int impar=5;
int par=2;
int internos=4;

while(planta<=altura) {
  for(int i=0;i<espacios;i++) {
    System.out.print(" ");
  }
  if(planta%2==1) {
    for(int i=1;i<=impar;i++) {
      System.out.print("*");
    }
    System.out.println();
  planta++;
  espacios--;
  impar+=4;
  } else {
    for(int i=1;i<=par;i++) {
      System.out.print("*");
    }
    for(int i=1;i<internos;i++) {
      System.out.print(" ");
    }
     for(int i=1;i<=par;i++) {
      System.out.print("*");
    }
    System.out.println();
  planta++;
  espacios--;
  par+=2;
  
  }
  
}
}
}
