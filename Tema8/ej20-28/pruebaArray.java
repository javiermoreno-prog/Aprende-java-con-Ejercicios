import java.util.Scanner;
import paquete.*;
public class pruebaArray {
public static void main(String[] args)  
throws InterruptedException{
  Scanner s=new Scanner(System.in);
 

 
 int[] a=new int[5];
 
 for(int i=0;i<5;i++) {
   a[i]=(int)(Math.random()*30);
 }

 int[] b=paquete.ej20al28.generaArray(9,1,99);
  
 System.out.println(paquete.ej20al28.minimo(b));
 System.out.println(paquete.ej20al28.maximo(b));
 System.out.println(paquete.ej20al28.media(b));
 System.out.println(paquete.ej20al28.esta(b,9));
 System.out.println(paquete.ej20al28.posicion(a,9));
 
 //voltea
 int[] c=paquete.ej20al28.voltea(a);
 
 for(int i=0;i<5;i++) {
   System.out.print(a[i] + " ");
 }
 System.out.println();
  for(int i=0;i<5;i++) {
   System.out.print(c[i] + " ");
 } 
  System.out.println();
  
  //rotar derecha
  int[] d=paquete.ej20al28.rotaDerecha(a,2);
 for(int i=0;i<5;i++) {
   System.out.print(d[i] + " ");
 } 
  System.out.println();
  
  //rotar izquierda
   
 int[] p=new int[5];
 
 for(int i=0;i<5;i++) {
   p[i]=(int)(Math.random()*30);
 }
 
  for(int i=0;i<5;i++) {
   System.out.print(p[i] + " ");
 }
 System.out.println();
 int[] e=paquete.ej20al28.rotaIzquierda(p,2);
  for(int i=0;i<5;i++) {
   System.out.print(e[i] + " ");
 } 
  
  //fin
}
}
