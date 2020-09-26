import java.util.Scanner;
public class ej37 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();
String respuesta=" ";
int volteado=0;

int copia=n;

while(copia>0) {
  volteado=(volteado*10)+(copia%10);
  copia /=10;
}

while(volteado>0) {
  int digito=volteado%10;
  for(int i=1;i<=digito;i++) {
    respuesta+="|";
  }

  respuesta+="-";
  volteado /=10;
}
 System.out.print(respuesta);
}
}
