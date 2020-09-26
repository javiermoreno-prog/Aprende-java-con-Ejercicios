import java.util.Scanner;
public class ej38 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();

int planta=1;
int espacio=0;
int linea=altura;

//primera parte 
while(planta< altura /2 +1) {
  for(int i=1;i<=espacio;i++) {
    System.out.print(" ");
  }
  for(int i=1;i<=linea;i++) {
    System.out.print("*");
  }
  System.out.println();
  planta++;
  linea-=2;
  espacio++;
  
}
//segunda parte
planta=1;
espacio=(altura/2);
linea=1;
while(planta<=altura / 2+1) {
  for(int i=1;i<=espacio;i++) {
    System.out.print(" ");
  }
  for(int i=1;i<=linea;i++) {
    System.out.print("*");
  }
  System.out.println();
  planta++;
  linea+=2;
  espacio--;
}
}
}
