import java.util.Scanner;
public class ej40 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();
int planta=1;
int espacios=altura/2;
int internos=0;
//primera parte
while(planta<altura/2+1) {
  for(int i=1;i<=espacios;i++) {
    System.out.print(" ");
  }
  System.out.print("*");
  for(int i=1;i<internos;i++) {
    System.out.print(" ");
  }
  if(planta>1) {
    System.out.print("*");
  }
  System.out.println();
  planta++;
  espacios--;
  internos+=2;
}
//segunda parte
planta=1;
internos=altura-1;
espacios=0;

while(planta<=altura/2+1) {
   for(int i=1;i<=espacios;i++) {
    System.out.print(" ");
  }
  System.out.print("*");
  for(int i=1;i<internos;i++) {
    System.out.print(" ");
  }
  if(planta<altura/2+1) {
    System.out.print("*");
  }
  System.out.println();
  planta++;
  espacios++;
  internos-=2;
}
}
}



