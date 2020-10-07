import java.util.Scanner;
public class ej66 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Por favor, introduzca la altura de la figura: ");
int altura=s.nextInt();
if((altura<3) || (altura%2==0)) {
  System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
} else {
int planta=1;
int espacio=0;
int interno=altura/2;

while(planta<=altura/2) {
for(int i=1;i<=espacio;i++) {
  System.out.print(" ");
}
System.out.print("*");
for(int i=1;i<=interno;i++) {
  System.out.print(" ");
}
System.out.print("*");

System.out.println();
espacio++;
planta++;
}  
espacio=altura/2;
planta=1;
while(planta<=altura/2+1) {
  for(int i=0;i<espacio;i++) {
  System.out.print(" ");
}
System.out.print("*");
  for(int i=0;i<interno;i++) {
  System.out.print(" ");
}
System.out.print("*");
System.out.println();
espacio--;
planta++;
}  
}
}
}
