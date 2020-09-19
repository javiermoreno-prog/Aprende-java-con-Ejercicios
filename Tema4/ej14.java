import java.util.Scanner;
public class ej14 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("dime un numero: ");
 int numero=s.nextInt();
 
 if(((numero % 2)==0) && ((numero % 5)==0)) {
   System.out.println("el numero es div entre 2 y 5");
 } else if(((numero % 2)==0)) {
   System.out.println("el numero es par");
 } else if(((numero % 5)==0)) {
   System.out.println("el numero es div entre 5");
 }
}
}
 
