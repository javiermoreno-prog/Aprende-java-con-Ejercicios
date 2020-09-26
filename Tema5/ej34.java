import java.util.Scanner;
public class ej34 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n1=s.nextInt();
System.out.println("Dime otro numero: ");
int n2=s.nextInt();
int volteado1=0;
int volteado2=0;
int copia=n1;
int longitud=0;
int digito=0;

while(copia>0) {
  volteado1=(volteado1*10)+(copia%10);
  copia /=10;
  longitud++;
}
copia=n2;
while(copia>0) {
 volteado2=(volteado2*10)+(copia%10);
  copia /=10;
} 
int resulPares=0;
int resulImpares=0;

for(int i=0;i<longitud;i++) {
   digito=volteado1%10;
  if(digito%2==0) {
    resulPares=(resulPares*10)+digito;
  } else {
    resulImpares=(resulImpares*10)+digito;
  }
 digito=volteado2%10;
 if(digito%2==0) {
    resulPares=(resulPares*10)+digito;
  } else {
    resulImpares=(resulImpares*10)+digito;
  }
  volteado1 /=10;
  volteado2 /=10;
}
// Muestra el resultado ////////////////////////////////////////////////////
System.out.println("El número formado por los dígitos pares es: " + resulPares);
System.out.println("El número formado por los dígitos impares es: " + resulImpares);
}
}
