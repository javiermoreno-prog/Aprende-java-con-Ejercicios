import java.util.Scanner;
public class ej31 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Introduzca la altura de la L: ");
int altura=s.nextInt();

for(int i=0;i<altura;i++) {
  System.out.println("*");
}
for(int i=0;i<(altura-2);i++) {
  System.out.print("* ");
}
}
}
