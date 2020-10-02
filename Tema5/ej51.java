import java.util.Scanner;
public class ej51 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime el numero: ");
int n=s.nextInt();
int respuesta=0;
int copia=n;
int volteado=0;
int contador=0;

while(copia>0) {
  volteado=(volteado*10)+(copia%10);
  copia /=10;
}

while(volteado>0) {
  int digito=volteado%10;
  respuesta=0;
  if((digito==0) || (digito==8)) {
    System.out.print("");
    contador++;
  } else {
    respuesta=digito;
  }
  if(respuesta==0) {
     System.out.print("");
   } else {
     System.out.print(respuesta);
   }
  volteado /=10;
}
System.out.println();
if(contador==0) {
  System.out.print("El gusano numérico no se ha comido ningún dígito.");
}
}
  
}
