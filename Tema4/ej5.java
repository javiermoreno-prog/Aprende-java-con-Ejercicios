import java.util.Scanner;
public class ej5 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
 System.out.println("Por favor,introduzca el valor de a: ");
 int a=s.nextInt();
 System.out.println("Ahora introduzca el valor de b: ");
 int b=s.nextInt();
 
  if(a==0) {
    System.out.println("esa ecuacion no tiene solucion real");
  }
  if(b==0) {
    System.out.println("la x es igual a 0");
  }
  double x;
  x=-b/a;
  System.out.println(x);
}
}

 
 
