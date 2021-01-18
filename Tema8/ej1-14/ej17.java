import java.util.Scanner;
public class ej17 {
public static void main(String[] args)  
throws InterruptedException{
  
  int a=10101100;
  int longitud=ej1al14.digitos(a);
  int contador=0;
  
  int resultado=0;
  int po=0;
  
  for(int i=0;i<longitud;i++) {
    po=ej1al14.potencia(2,contador);
    resultado+=a%10*po;
    a/=10;
    contador++;
  }
  
 System.out.print(resultado); 
  //fin
}
}
