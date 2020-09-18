import java.util.Scanner;
public class ej12 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Introduce la nota del primer examen: ");
int n1=s.nextInt();
System.out.println("¿Qué nota quieres sacar en el trimestre?: ");
double o=s.nextDouble();

double x= (o-(n1*0.4))/0.6;

System.out.println("Para tener un " + o + " en el trimestre necesitas sacar un "+x);
}
}
