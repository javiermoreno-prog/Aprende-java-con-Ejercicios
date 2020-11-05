import java.util.Scanner;
public class ej02 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
//javier moreno aguilera
System.out.println("Dime un numero: ");
long n=s.nextLong();

long copia=n;
long volteado=0;
long longi=0;
long pares=0;
long dig=0;
long impares=0;

while(copia>0) {
  volteado=(volteado*10)+(copia%10);
  longi++;
  copia/=10;
}
copia=n;
//digitos pares
for(int i=1;i<=longi;i++) {
  dig=volteado%10;
  if(dig%2==0) {
    pares+=dig;
    pares*=10;
  }
  volteado/=10;
}

//digitos impares
for(int i=1;i<=longi;i++) {
  dig=copia%10;
  if(dig%2==1) {
    impares+=dig;
    impares*=10;
  }
  copia/=10;
}
 
//pares
System.out.println("Las cifras pares del número: " + n + "son: "+(pares/10));
System.out.println("Las cifras impares del número " + n + "son: "+(impares/10));
//fin del programa
}
}
