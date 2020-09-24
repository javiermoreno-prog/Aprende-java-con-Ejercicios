import java.util.Scanner;
public class ej33 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Introduzca la altura de la U: ");
int altura=s.nextInt();
int planta=1;

while(planta<=altura-1) {
  

  System.out.print("*");
  
  for(int j=0;j<(altura-2);j++) {
    System.out.print(" ");
  }
 
   System.out.print("*");
 
 
System.out.println();
planta++;
}
//base
System.out.print(" ");
for(int i=0;i<altura-2;i++) {
  System.out.print("*");
}
}
}
