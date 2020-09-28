import java.util.Scanner;
public class ej47 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();
int planta=0;
int anchura=6;
int a=altura/2;

while(planta<=altura) {
for(int i=1;i<=anchura;i++) {
  System.out.print("M");
}
  planta++;
System.out.println();

  for(int i=1;i<=a;i++) {
    System.out.print("M");
    for(int j=2;j<anchura;j++) {
      System.out.print(" ");
    }
        System.out.print("M");
        planta++;
        System.out.println();
     }
     if(planta>=altura-1) {
     for(int i=1;i<=anchura;i++) {
  System.out.print("M");
}
} else {
  System.out.print("");
}
planta++;
}
  
}
}

