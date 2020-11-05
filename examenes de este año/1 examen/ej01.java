import java.util.Scanner;
public class ej01 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
//numero de lista 21
//javier moreno aguilera
//esta es la version original
int f;
int c;

System.out.println("DIME FILAS: ");
f=s.nextInt();

 

System.out.println("DIME COLUMNAS: ");
c=s.nextInt();

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

