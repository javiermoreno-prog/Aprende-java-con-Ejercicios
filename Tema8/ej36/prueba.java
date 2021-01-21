import java.util.Scanner;
public class prueba {
public static void main(String[] args)  
throws InterruptedException{
  Scanner s=new Scanner(System.in);
 
int[] n=new int[10];

for(int i=0;i<10;i++) {
  n[i]=(int)(Math.random()*100)+10;
  System.out.print(n[i] + " ");
}
System.out.println();

int cont=funciones.tamanio(n);

System.out.print(cont);
System.out.println();

int[] o=funciones.filtra(n);

for(int i=0;i<o.length;i++) {
  System.out.print(o[i] + " ");
}

//fin
}
}
