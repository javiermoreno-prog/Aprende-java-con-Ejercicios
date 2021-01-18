import java.util.Scanner;
public class ej19 {
public static void main(String[] args)  
throws InterruptedException{
Scanner s=new Scanner(System.in);

 System.out.println("Dime el numero: ");
 int n=s.nextInt();
 System.out.println("Dime que conversion quieres (1,2,3,4): ");
 int res=s.nextInt();
 
 switch(res) {
   case 1:
   int longitud=ej1al14.digitos(n);
  int contador=0;
  
  int resultado=0;
  int po=0;
  
  for(int i=0;i<longitud;i++) {
    po=ej1al14.potencia(2,contador);
    resultado+=n%10*po;
    n/=10;
    contador++;
  }
  
 System.out.print(resultado); 
 break;
 case 2:
int resul=0;

int copia=n;

 while(copia>3) {
   resul+=(int)copia%2;
   resul*=10;
  
     copia=(int)copia/2;   
   
   
   System.out.println("\u001B[32m" + copia);
   System.out.println("\u001B[35m" + resul);
   
 }
 System.out.print(resul+1);
 break;
 default:
}

//fin
}
}
