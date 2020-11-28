import java.util.Scanner;
public class ej08 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int[] n=new int[12];
int contador=0;

for(int i=0;i<12;i++) {
System.out.println("Dime la temperatura del mes " + i + " : ");
n[i]=s.nextInt();
}

System.out.println("Diagrama de temperaturas");

for(int i=0;i<12;i++) {
  contador=n[i];
  while(contador>0) {
    System.out.print("*");
    contador--;
  }
  System.out.println();
}

//fin del programa
}
}
