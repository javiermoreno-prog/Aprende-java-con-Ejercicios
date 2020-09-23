import java.util.Scanner;
public class ej32 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();

int volteado=0;

int suma=0;

while(n>0) {
volteado=(volteado*10)+(n%10);
n /=10;
}

while(volteado>0) {
  int dig=volteado%10;
  if((dig%2)==0) {
    System.out.println(dig + " ");
   suma+=dig;
  }
  volteado /=10;
}
System.out.println("La suma es: "+ suma);

}
}
