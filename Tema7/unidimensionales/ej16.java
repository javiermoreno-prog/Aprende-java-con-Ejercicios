import java.util.Scanner;
public class ej16 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int[] n=new int[20];

for(int i=0;i<20;i++) {
  n[i]=(int)(Math.random()*401);
}

for(int i=0;i<20;i++) {
  System.out.print(n[i] + " ");
}

System.out.print("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
int opcion=s.nextInt();

if(opcion==1) {
  for(int i=0;i<20;i++) {
    if(n[i]%5==0) {
      System.out.print("[ " + n[i] + " ]");
    } else {
      System.out.print(n[i] + " ");
    }
  }
} else {
  for(int i=0;i<20;i++) {
    if(n[i]%7==0) {
      System.out.print("[ " + n[i] + " ]");
    } else {
      System.out.print(n[i] + " ");
    }
  }
}

//fin del programa
}
}
