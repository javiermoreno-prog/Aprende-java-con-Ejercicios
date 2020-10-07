import java.util.Scanner;
public class ej61 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura; ");
int altura=s.nextInt();
int intermedios=altura*2;
int espacios=0;
int planta=1;

while(planta<=altura) {
  for(int i=1;i<=espacios;i++) {
    System.out.print(" ");
  }
  System.out.print("***");
  
  for(int i=0;i<=intermedios;i++) {
    System.out.print(" ");
  }
  
  System.out.print("***");
  
  System.out.println();
  espacios++;
  intermedios-=2;
  planta++;
}
for(int i=0;i<espacios;i++) {
    System.out.print(" ");
  }
System.out.print("******");
} 
}
