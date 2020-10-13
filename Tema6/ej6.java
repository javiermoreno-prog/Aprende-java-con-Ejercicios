import java.util.Scanner;
public class ej6 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int respuesta=(int)(Math.random()*101);

boolean acertado=false;
int oportunidades=5;
int propuesta;
do {
System.out.println("Dime el numero: ");
propuesta=s.nextInt();

if(propuesta==respuesta) {
  System.out.println("Has acertado");
  acertado=true;
} else if(propuesta<respuesta) {
  System.out.println("El numero propuesto es menor que la respuesta");
  oportunidades--;
} else {
  System.out.println("El numero propuesto es mayor que la respuesta");
  oportunidades--;
}
  if(oportunidades==0) {
    System.out.print("Te has quedado sin oportunidades");
  }
} while((acertado==false) && (oportunidades>=1));


}
}
