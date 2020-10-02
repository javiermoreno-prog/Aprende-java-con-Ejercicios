import java.util.Scanner;
public class ej52 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Dime el numero: ");
int n=s.nextInt();

int copia=n;
int longitud=0;
int resto=0;
int hola=1;
while(copia>0) {
 copia /=10;
 longitud++;
}
for(int i=1;i<longitud;i++) {
  hola*=10;
}

   resto=n/hola;
   
  int resto2=resto*hola;
   int resultado=0;
   resultado=(n-resto2)*10+resto;
   System.out.print(resultado);
 }
}
