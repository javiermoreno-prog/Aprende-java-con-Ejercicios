import java.util.Scanner;
public class ej35 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();
int espacios=0;
int internos=altura-1;
int planta=1;

while(planta< altura/2+1) {
  for(int i=1;i<=espacios;i++) {
    System.out.print(" ");
  }
  System.out.print("*");
  for(int i=1;i<internos;i++) {
    System.out.print(" ");
  }
  if(planta<(altura/2+1)) {
  System.out.print("*");
}
System.out.println();
planta++;
espacios++;
internos-=2;
}
espacios=altura/2;
internos=0;
planta=1;

while(planta<=altura/2+1) {
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
}
}
