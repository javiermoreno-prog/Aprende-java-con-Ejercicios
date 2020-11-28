import java.util.Scanner;
public class ej02 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); 

int[][] num=new int[4][5];

int numero=0;
int[] aux=new int[20];
int z=0;

for(int i=0;i<20;i++) {
  System.out.print("Dime numeros: ");
  numero=s.nextInt();
 aux[i]=numero;
 } 
 
  for(int j=0;j<4;j++) {
    for(int k=0;k<5;k++) {
      num[j][k]=aux[z];
      z++;
    }
    
  }
  for(int j=0;j<4;j++) {
    for(int k=0;k<5;k++) {
      System.out.print(num[j][k] + " ");
    }
    System.out.print("Fila "+j);
    System.out.println();
  }
  int suma1=num[0][0] + num[1][0] + num[2][0]+num[3][0];
  int suma2=num[0][1] + num[1][1] + num[2][1]+num[3][1];
  int suma3=num[0][2] + num[1][2] + num[2][2]+num[3][2];
  int suma4=num[0][3] + num[1][3] + num[2][3]+num[3][3];
  int suma5=num[0][4] + num[1][4] + num[2][4]+num[3][4];
  
  System.out.print("Columna 0: "+suma1);
  System.out.println();
  System.out.print("Columna 1: "+suma2);
  System.out.println();
  System.out.print("Columna 2: "+suma3);
  System.out.println();
  System.out.print("Columna 3: "+suma4);
  System.out.println();
  System.out.print("Columna 4: "+suma5);
  System.out.println();
  System.out.print("Suma Total: "+(suma1+suma2+suma3+suma4+suma5));
  
  //fin del programa
}
}
/*hecho de nuevo creo que mejor
 * 
   int[][] num=new int[4][5];
   
   for(int i=0;i<4;i++) {
     for(int j=0;j<5;j++) {
       num[i][j]=(int)(Math.random()* 20);
     }
   }
   
   int sumaFila=0;
   int sumaColumna=0;
   int total=0;
   
   for(int i=0;i<4;i++) {
      sumaFila=0;
     for(int j=0;j<5;j++) {
       System.out.print(num[i][j] + " ");
       sumaFila+=num[i][j];
       total+=sumaFila;
     }
    System.out.print(" | " + sumaFila);
   System.out.println();
 }
 
    for(int j=0;j<5;j++) {
      sumaColumna=0;
     for(int i=0;i<4;i++) {
      sumaColumna+=num[i][j];
      total+=sumaColumna;
    }
     System.out.print(sumaColumna + "|");
  }
     //total
     
     System.out.print(total);
       
  ///fin del programa
}
}
*/
