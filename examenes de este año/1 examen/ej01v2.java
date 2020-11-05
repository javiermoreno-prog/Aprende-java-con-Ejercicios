import java.util.Scanner;
public class ej01v2 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
//numero de lista 21
//esta es la version mejorada
//javier moreno aguilera
int f;
int c;

do {
System.out.println("DIME FILAS: ");
f=s.nextInt();
if((f<1) || (f>20)) {
  System.out.print("Valor fuera de rango.");
}
} while((f<1) || (f>20));
do {
System.out.println("DIME COLUMNAS: ");
c=s.nextInt();
if((c<1) || (c>20)) {
 System.out.print("Valor fuera de rango.");
} 
} while((c<1) || (c>20));
int planta=1;
String caracter="██";


while(planta<f) {
  //fila impar
  if(planta%2==1) {
  for(int i=1;i<=c;i++) {
    if(i%2==1) {
      System.out.print(caracter);
    } else {
      System.out.print("  ");
    }
  }
    System.out.println();
    planta++;
  } else {
  for(int i=1;i<=c;i++) {
    if(i%2==0) {
      System.out.print(caracter);
    } else {
      System.out.print("  ");
    }
  }
    System.out.println();
    planta++;
}
}
  //fin del programa
}
}

