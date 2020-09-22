import java.util.Scanner;
public class ej7 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int combinacion=1234;
boolean entra=false;
int oportunidades=4;

while((entra==false) && (oportunidades>0)) {
System.out.println("Dime la combinacion: ");
int propuesta=s.nextInt();

if(propuesta==combinacion) {
  entra=true;
  System.out.println("La caja fuerte se ha abierto satisfactoriamente");
} else {
  System.out.println("Lo siento, esa no es la combinación");
  oportunidades--;
}
}
}
}
