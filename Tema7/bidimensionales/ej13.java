import java.util.Scanner;
public class ej13 {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);

  String[] pais={"España","Rusia","Japon","Australia"};
  int x=0;//indice de pais
  int[][] estaturas=new int[4][10];
   
   int[] estesp=new int[10];
   int z=0;//indice de esteesp
   int j=0;
   //media,minimo,maximo
   int contador=0;
   int suma=0;
   int minimo=210;
   int maximo=140;
   
   for(int i=0;i<4;i++) {
     for(j=0;j<10;j++) {
       estaturas[i][j]=(int)(Math.random()*71)+140;
     }
   }
   
   int i=0;
   j=0;
   
   System.out.printf("%55s %1s %1s","MED","MIN","MAX");
   System.out.println();
   for(x=0;x<4;x++) {
     //reiniciamos variables
     i=0;
     j=0;
     contador=0;
     suma=0;
     minimo=210;
     maximo=140;
     
     System.out.print(pais[x] + " ");
     for(i=0;i<10;i++) {
       estesp[i]=estaturas[x][j];
       j++;
     }
     for(i=0;i<10;i++) {
       System.out.print(estesp[i] + " ");
       contador++;
       suma+=estesp[i];
       if(estesp[i]<minimo) {
         minimo=estesp[i];
       }
       if(estesp[i]>maximo) {
         maximo=estesp[i];
       }
     }
     //media,minimo,maximo
     System.out.print("|");
     System.out.print((suma/contador) + " ");
     System.out.print(minimo + " ");
     System.out.print(maximo + " ");
     System.out.println();
   }
   
   //fin del programa
 }
}
/*rehecho
 *  String[] pais={"España","Rusia","Japon","Australia"};
   int[][] n=new int[4][10];
   int con=0;
   int sum=0;
   int min=211;
   int max=139;
   
   for(int i=0;i<4;i++) {
     for(int j=0;j<10;j++) {
       n[i][j]=(int)(Math.random()*70)+141;
     }
   }
   
   for(int i=0;i<4;i++) {
     System.out.print(pais[i] + ": ");
     con=0;
       sum=0;
       min=211;
       max=139;
     for(int k=0;k<10;k++) {
       System.out.print(n[i][k] + " ");
       con++;
       sum+=n[i][k];
       if(n[i][k]<min) {
         min=n[i][k];
       }
       if(n[i][k]>max) {
         max=n[i][k];
       }
     }
     System.out.print(" | ");
     System.out.print(sum/con + " ");
     System.out.print(min + " ");
     System.out.print(max + " ");
     System.out.println();
   }
   
 }
}
* */

       
