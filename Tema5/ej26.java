import java.util.Scanner;
public class ej26 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();
System.out.println("Dime un digito: ");
int digito=s.nextInt();
int pos=1;

int volteado=0;

while(n>0) {
volteado=(volteado*10)+(n%10);
n /=10;
}

while(volteado>0) {
  int resultado=volteado%10;
  if(resultado==digito) {
    System.out.println(pos);
  }
  volteado /=10;
  pos++;
}
}
}
