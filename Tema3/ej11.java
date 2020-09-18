import java.util.Scanner;
public class ej11 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Por favor, introduzca el número de Kb: ");
double kb = s.nextDouble();
System.out.println(kb + "Kb son " + (kb / 1024) + "Mb.");
}
}
