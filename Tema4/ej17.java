import java.util.Scanner;
public class ej17 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("dime un numero: ");
 int numero=s.nextInt();
 
 int digito=numero%10;
 
 System.out.println("La ultima cifra del numero es: "+digito);
}
}
