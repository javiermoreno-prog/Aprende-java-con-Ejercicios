import java.util.Scanner;
public class ej59 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Por favor, introduzca la altura del árbol: ");
int altura=s.nextInt();

int espacios=altura-3;
int planta=1;
int internos=0;

for(int i=0;i<=espacios;i++) {
  System.out.print(" ");
}
System.out.println("*");

while(planta<=altura-1) {
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
   internos+=2;
   espacios--;
 }
 espacios=altura-3;
 for(int i=1;i<=altura*2-2;i++) {
   System.out.print("*");
 }
 System.out.println();
 
 for(int i=0;i<espacios;i++) {
  System.out.print(" ");
}
System.out.print("*");

}
}
