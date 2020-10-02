import java.util.Scanner;
public class ej53 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Introduzca la altura de la figura: ");
int altura=s.nextInt();
int planta=1;
int linea=altura;

while(planta<=altura) {
for(int i=0;i<linea;i++) {
  System.out.print("*");
}
System.out.println();
planta++;
linea--;
}
}
}  
