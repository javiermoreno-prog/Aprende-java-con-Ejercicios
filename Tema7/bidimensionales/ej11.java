import java.util.Scanner;
public class ej11 {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
  
 int[][] n=new int[10][10];
 int[]di=new int[10];

 int x=0;
 int y=0;
 //maximo,minimo y media
 int suma=0;
 int contador=0; 
 int maximo=199;
 int minimo=301;
 //inicializamos
 for(int i=0;i<10;i++) {
   for(int j=0;j<10;j++) {
     n[i][j]=(int)(Math.random()*101)+200;
   }
 }
 
 
 //printeamos
  for(int i=0;i<10;i++) {
   for(int j=0;j<10;j++) {
     System.out.print(n[i][j] + " ");
   }
   System.out.println();
 }
 
 //diagonal
 for(int i=0;i<10;i++) {
 
     di[i]=n[x][y];
    suma+=di[i];
    contador++;
    if(di[i]<minimo) {
      minimo=di[i];
    }
    if(di[i]>maximo) {
      maximo=di[i];
    } 
     x++;
     y++;
    
     
   }
 
 
 
 //printeamos
 System.out.println();
  for(int i=0;i<10;i++) {
   
     System.out.print(di[i] + " ");
   }
   System.out.println();
   System.out.print("Media: "+(suma/contador));
      System.out.println();
   System.out.print("Maximo: "+maximo);
      System.out.println();
   System.out.print("Minimo: "+minimo);
 }
 

}
/*rehecho
 * 
  int[][] n=new int[10][10];
  int[] d=new int[10];
  //contadores
  int c1=0;
  int c2=0;
  //resto de variables
  int min=301;
  int max=199;
  int con=0;
  int sum=0;
  
  for(int i=0;i<10;i++) {
   for(int j=0;j<10;j++) {
    n[i][j]=(int)(Math.random()*100)+200;
  }
}
 
 for(int i=0;i<10;i++) {
     d[i]=n[c1][c2];
     c1++;
     c2++;
     con++;
     sum+=d[i];
     
     if(d[i]<min) {
       min=d[i];
     }
     if(d[i]>max) {
       max=d[i];
     }
 }
 
 System.out.print("original");
 System.out.println();
   for(int i=0;i<10;i++) {
   for(int j=0;j<10;j++) {
     System.out.print(n[i][j] + " ");
   }
   System.out.println();
 }
 System.out.println();
 System.out.print("diagonal");
 System.out.println();
 for(int k=0;k<10;k++) {
   System.out.print(d[k] + " ");
 }
 System.out.println(); 
System.out.print("minimo "+ min + "maximo" + max + " media "+(sum/con));
 System.out.println();

}
}
* */

