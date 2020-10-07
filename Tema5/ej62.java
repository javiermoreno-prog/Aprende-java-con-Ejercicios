import java.util.Scanner;
public class ej62 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Introduzca un número: ");
int n=s.nextInt();

int copia=n;
int suerte=0;
int digito=0;
int mala=0;

while(copia>0) {
  digito=copia%10;
  if((digito==3)||(digito==7)||(digito==8)||(digito==9)) {
   suerte++;
 } else {
   mala++;
 }
 copia /=10;
}
if(suerte>mala) {
  System.out.println("El numero "+ n +"es un numero afortunado");
} else {
   System.out.println("El numero "+ n +"no es un numero afortunado");
  }
}
}

