import java.util.Scanner;
public class ej13 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("Este programa ordena numeros: ");
 int a=Integer.parseInt(System.console().readLine());
 int b=Integer.parseInt(System.console().readLine());
 int c=Integer.parseInt(System.console().readLine());
 int aux;
 
 //ordenamos los dos primeros numeros
 if(a>b) {
 aux=a;
 a=b;
 b=aux;
}
//ordenamos los dos ultimos
if(b>c) {
  aux=b;
  b=c;
  c=aux;
}
//ordenamos los dos primeros otra vez
if(a>b) {
 aux=a;
 a=b;
 b=aux;
}
System.out.println("la secuencia es: "+ a + " "+ b + " "+ c );
}
}
