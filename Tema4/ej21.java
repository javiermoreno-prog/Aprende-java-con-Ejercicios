import java.util.Scanner;
public class ej21 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
  System.out.println("Nota del primer control: ");
  double n1=s.nextInt();
  System.out.println("Nota del segundo control: ");
  double n2=s.nextInt();
  double total=(n1+n2)/2;
  if(total>=5) {
    System.out.println("Tu nota de Programación es: "+total);
  } else {
  System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
  String resultado=s.next();
  if(resultado.equals("apto")) {
    System.out.println("Tu nota de Programación es 5");
  } else {
    System.out.println("Tu nota de Programación es "+total);
  }
}
}
}
