import java.util.Scanner;
public class ej50 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();
int planta=1;
System.out.println("espacios: ");
int espacios=s.nextInt();


while(planta<=altura) {
  System.out.print("*");
  for(int i=0;i<espacios;i++) {
    System.out.print(" ");
  }
  System.out.print("****");
  for(int i=0;i<espacios;i++) {
    System.out.print(" ");
  }
   System.out.print("****");
   System.out.println();
   planta++;
   if(planta==2) {
     System.out.print("*");
      for(int i=0;i<espacios;i++) {
    System.out.print(" ");
  }
     System.out.print("*");
      for(int i=0;i<espacios*2-1;i++) {
    System.out.print(" ");
  }
     System.out.print("*");
     System.out.println();
   planta++;

 }
 if((planta==4) && (planta<altura)) {
    System.out.print("a");
      for(int i=0;i<espacios*2;i++) {
    System.out.print(" ");
  }
     System.out.print("*");
      for(int i=0;i<espacios*3;i++) {
    System.out.print(" ");
  }
     System.out.print("*");
     System.out.println();
   planta++;
  
 }
 
}
}
}
