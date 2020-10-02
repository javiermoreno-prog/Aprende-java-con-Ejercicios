import java.util.Scanner;
public class ej56 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Introduzca la altura de la figura: ");
int altura=s.nextInt();
int planta=1;
int linea=altura;
int espacio=0;

while(planta<=altura) {
 for(int i=0;i<espacio;i++) {
   System.out.print(" ");
 }
 for(int i=0;i<linea;i++) {
   System.out.print("*");
 }
 System.out.println();
 planta++;
 linea--;
 espacio++;
}
}
}
