public class ej36 {
public static void main(String[] args) {
System.out.println("Por favor, introduzca un número entero positivo: ");
int numero=Integer.parseInt(System.console().readLine());
int volteado=0;
int copia=numero;
 while(copia>0) {
   volteado=(volteado*10)+(copia%10);
   copia /=10;
 }
 
 if(volteado==numero) {
   System.out.println("El numero es capicua");
 } else {
   System.out.println("El numero no es capicua");
}
}
}
