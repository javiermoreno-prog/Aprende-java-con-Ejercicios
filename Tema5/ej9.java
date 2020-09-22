import java.util.Scanner;
public class ej9 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int numero=s.nextInt();
int digito=0;
while(numero>0) {
  digito++;
  numero /=10;
}
System.out.println(digito);
}
}
