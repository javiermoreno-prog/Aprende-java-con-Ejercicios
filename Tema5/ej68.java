import java.util.Scanner;
public class ej68 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();

int digito=0;

int copia=n;
int volteado=0;
int resultado=0;

while(copia>0) {
 volteado=(volteado*10)+(copia%10);
 copia /=10;
}
 
while(volteado>0) {
  digito=volteado%10;
  if(digito%2==0) {
    digito++;
  } else {
    digito--;
  }
  resultado=(resultado*10)+(digito);
  volteado /=10;
}
System.out.println(resultado);
}
}
