import java.util.Scanner;
public class ej25 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();

int volteado=0;

while(n>0) {
volteado=(volteado*10)+(n%10);
n /=10;
}
System.out.println("El volteo es igual a: "+volteado);
}
}
  
