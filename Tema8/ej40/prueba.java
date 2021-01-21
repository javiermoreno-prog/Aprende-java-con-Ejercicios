import java.util.Scanner;
public class prueba {
public static void main(String[] args)  
throws InterruptedException{
  Scanner s=new Scanner(System.in);

int[] n=new int[10];

for(int i=0;i<10;i++) {
  n[i]=(int)(Math.random()*100);
  System.out.print(n[i] + " ");
}
System.out.println();

for(int i=0;i<10;i++) {
  System.out.print((n[i]%10) + " ");
}
System.out.println();

int[] a=funciones.filtra(n);

for(int i=0;i<a.length;i++) {
  System.out.print(a[i] + " ");
}


//fin
}
}
