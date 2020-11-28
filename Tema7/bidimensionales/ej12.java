import java.util.Scanner;
public class ej12 {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);

int[][] n=new int[9][9];
int[] di=new int[9];

int i=0;
int j=0;

//maximo,minimo,media
int contador=0;
int suma=0;
int maximo=499;
int minimo=901;
for(i=0;i<9;i++) {
for(j=0;j<9;j++) {
 n[i][j]=(int)(Math.random()*401)+500;
}
}
//printeamos
  for(i=0;i<9;i++) {
   for(j=0;j<9;j++) {
     System.out.print(n[i][j] + " ");
   }
   System.out.println();
 }
 
 //diagonal
 i=8;
 j=0;
 for(int x=0;x<9;x++) {
   di[x]=n[i][j];
   suma+=di[x];
   contador++;
   if(di[x]<minimo) {
     minimo=di[x];
   }
   if(di[x]>maximo) {
     maximo=di[x];
   }
   i--;
   j++;
 }
 //printeamos la solucion
 System.out.println();
 for(int x=0;x<9;x++) {
   System.out.print(di[x] + " ");
 }
 System.out.println();
 System.out.print("Maximo: "+maximo);
 System.out.println();
 System.out.print("Minimo: "+minimo); 
  System.out.println();
 System.out.print("Media: "+(suma/contador));
 //fin del programa
}
}
/* rehecho 
 * int[][] n=new int[10][10];
  int[] d=new int[10];
  //contadores
  int c1=9;
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
     c1--;
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
*/
