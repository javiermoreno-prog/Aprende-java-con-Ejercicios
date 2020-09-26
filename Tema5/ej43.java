import java.util.Scanner;
public class ej43 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n=s.nextInt();
System.out.println("Dime la posicion: ");
int pos=s.nextInt();

int volteado=0;
int copia=n;
int parte1=0;
int parte2=0;
int longi=0;
int longi2=0;

while(copia>0) {
  volteado=(volteado*10)+(copia%10);
  copia /=10;
  longi++;
}
for(int i=1;i<pos;i++) {
  parte1=(parte1*10)+(volteado%10);
  volteado /=10;
 longi2++;
  
}
int longiTotal=longi-longi2;

int hola=1;
for(int i=1;i<=longiTotal;i++) {
  hola *=10;
}

parte2=n-(parte1*hola);


System.out.println(parte1);
System.out.println(parte2);
}
}
