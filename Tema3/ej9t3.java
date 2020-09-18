public class ej9t3 {
public static void main(String[] args) {
final double pi=3.141516;
System.out.println("dime el radio: ");
int radio=Integer.parseInt(System.console().readLine());
System.out.println("dime la altura: ");
int altura=Integer.parseInt(System.console().readLine());

double v=(1.0/3.0)*pi*radio*radio*altura;

System.out.println("area: "+v);
}
}
