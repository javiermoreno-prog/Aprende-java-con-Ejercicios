import java.util.Scanner;
public class ej14 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int numero=60;

int aumento=30;
int decremento=15;
boolean acertado=false;
int oportunidades=5;

do {
  int propuesta=(int)(Math.random()*101);
  System.out.println("El numero propuesto es : "+propuesta);
  System.out.println("Coincide?: ");
  String sn=s.next();
  if(sn.equals("si")) {
    acertado=true;
    System.out.println("Has acertado");
  } else {
  System.out.println("Es menor o mayor: ");
  String menor=s.next();
  oportunidades--;
  if(menor.equals("menor")) {
    propuesta -=decremento;
  } if (menor.equals("mayor")) {
    propuesta +=aumento;
  }
}
} while((acertado==false) && (oportunidades>0));
}
}

    
  
