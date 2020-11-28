import java.util.Scanner;
public class ej11 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

  int[] n=new int[10];
  int[] aux=new int[10];
  int primo=0;
  int noPrimo=1;
  //Array inicial
  for(int i=0;i<10;i++) {
    n[i]=s.nextInt();
  }

  System.out.print("Indice");
  for(int i=0;i<10;i++) {
    System.out.printf("%2d",i);
  }
  System.out.println();
  System.out.print("Valor");
  for(int i=0;i<10;i++) {
    System.out.printf("%3d",n[i]);
  }
  System.out.println();
  //Array final
  boolean esPrimo=true;

  for(int i=0;i<10;i++) {
    esPrimo=true;
   for(int j=2;j<=n[i]-1;j++) {
     
     if(n[i]%j==0) {
      esPrimo=false;
     }
    }
   if(esPrimo==true) {
    aux[primo]=n[i];
    primo++;
   } else {
    aux[10-noPrimo]=n[i];
    noPrimo++;
   }
  } //ultimo for

 System.out.println();
 for(int i=0;i<10;i++) {
  System.out.print(aux[i] + " ");
 }
//fin del programa
 }
}
/*rehecho no se si esta mejor pero esta hecho
 *   int[] n=new int[10];
  int[] aux=new int[10];
  boolean esPrimo=true;
  int contador=0;
  int noPrimo=0;
  
  
  for(int i=0;i<10;i++) {
    n[i]=s.nextInt();
  }
  
  System.out.println("Array original: ");
  for(int i=0;i<10;i++) {
   System.out.print(n[i] + " ");
  
  }
  System.out.println();
  
  System.out.println("Array final: ");
   
   for(int i=0;i<10;i++) {
     esPrimo=true;
      for(int j=2;j<=n[i]-1;j++) {
     if(n[i]%j==0) {
      esPrimo=false;
      
     }
   }
   if(esPrimo==true) {
contador++;
aux[noPrimo]=n[i];
noPrimo++;
 }
       
     }
   
  for(int i=0;i<10;i++) {
     esPrimo=true;
      for(int j=2;j<=n[i]-1;j++) {
     if(n[i]%j==0) {
      esPrimo=false;
      
     }
   }
   if(esPrimo==false) {
     aux[contador]=n[i];
     contador++;
   }
 }
 for(int i=0;i<10;i++) {
     System.out.print(aux[i] + " ");
   }
 
    
}
}
*/
