import java.util.Scanner;
public class pruebas {
public static void main(String[] args)  
throws InterruptedException{
  Scanner s=new Scanner(System.in);
 
 int[] n=new int[10];
 
 for(int i=0;i<10;i++) {
   n[i]=(int)(Math.random()*200);
   System.out.print(n[i] + " ");
 }
 System.out.println();

int contador=funciones.cuenta(n);

System.out.println(contador);

int[] q=funciones.filtra(n);

for(int i=0;i<q.length;i++) {
  System.out.print(q[i] + " ");
}

//fin
}
}

