import java.util.Scanner;
public class ej55 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime el numero: ");
int n=s.nextInt();
int longitud=0;
int copia=n;
int copia2=n;
int hola=1;
copia =copia%10;

while(copia2>0) {
  copia2 /=10;
  longitud++;
}
for(int i=1;i<longitud+1;i++) {
  hola *=10;
}
int resultado=n + (copia*hola);

System.out.print(resultado/10);
}
}
