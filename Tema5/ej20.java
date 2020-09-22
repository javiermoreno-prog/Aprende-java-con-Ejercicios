import java.util.Scanner;
public class ej20 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();
System.out.println("Dime el caracter: ");
String caracter=s.next();

int planta=1;
int linea=1;
int espacios=altura-1;
int internos=0;

while(planta<=altura) {
  for(int i=0;i<=espacios;i++) {
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
}
for(int i=0;i<(altura*2+1);i++) {
  System.out.print("*");
}
}
}

