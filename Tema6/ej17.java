import java.util.Scanner;
public class ej17 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
int altura=s.nextInt();
System.out.println("Ahora introduzca la anchura (como mínimo 4): ");
int anchura=s.nextInt();

int espPosible=anchura-2;



//pintar pecera
//anchura
for(int i=1;i<=anchura;i++) {
  System.out.print("*");
}
System.out.println();
//altura
for(int i=1;i<=altura-2;i++) {
System.out.print("*");

for(int j=1;j<=espPosible;j++) {
  int posicion=(int)(Math.random()*espPosible)+1;
  if(j==posicion) {
  System.out.print("&");
} else{
  System.out.print(" ");
}
}
System.out.print("*");
System.out.println();
}
//anchura
for(int i=1;i<=anchura;i++) {
  System.out.print("*");
}

}
}

