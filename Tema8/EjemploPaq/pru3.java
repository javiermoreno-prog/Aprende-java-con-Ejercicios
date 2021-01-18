import java.util.Scanner;
import mates.funcion;
public class pru3 {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
  int a, b;
 System.out.println("Dime a y b");
 a=s.nextInt();
 b=s.nextInt();
 int r1= mates.funcion.SumaBro(a,b);
 
 System.out.println("El resultado es: "+r1);
 
 mates.funcion.Despedida();
}

 //fin
}
