import java.util.Scanner;
public class ej65 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Introduzca la altura de la A (un número mayor o igual a 3): ");
int altura=s.nextInt();
System.out.println("Introduzca la fila del palito horizontal (entre 2 y "+(altura-1)+ "): ");
int fila=s.nextInt();
if((fila<2) || (fila>altura-1)) {
  System.out.println("La fila introducida no es correcta.");
} else {
int planta=1;
int espacios=altura;
int internos=0;

while(planta<=altura) {
  if(planta!=fila) {
  for(int i=0;i<espacios;i++) {
    System.out.print(" ");
  }
  System.out.print("*");
  for(int i=1;i<internos;i++) {
    System.out.print(" ");
}
  if(planta>1) {
    System.out.print("*");
  }
  System.out.println();
  planta++;
  espacios--;
  internos+=2;
} else {
  for(int i=0;i<espacios;i++) {
    System.out.print(" ");
  }
  for(int i=0;i<internos+1;i++) {
    System.out.print("*");
  }
  System.out.println();
  planta++;
  espacios--;
  internos+=2;
}
}
}
}
}
