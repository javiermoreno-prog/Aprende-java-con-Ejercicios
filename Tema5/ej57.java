import java.util.Scanner;
public class ej57 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Introduzca la altura de la figura: ");
int altura=s.nextInt();
int planta=1;
int linea=altura;
int espacio=1;
int internos=altura-2;

 for(int i=1;i<=linea+1;i++) {
   System.out.print("*");
 }
 System.out.println();
 
while(planta<=altura-1) {
 for(int i=0;i<espacio;i++) {
   System.out.print(" ");
 }
 System.out.print("*");
 for(int i=0;i<internos;i++) {
   System.out.print(" ");
 }
 if(planta<altura-1) {
    System.out.print("*");
  }
 System.out.println();
 planta++;
 espacio++;
 internos--;
}
}
}
