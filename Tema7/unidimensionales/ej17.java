import java.util.Scanner;
public class ej17 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); 
  int[] n=new int[10];
  int[] aux=new int[10];
  

  for(int i=0;i<10;i++) {
    n[i]=(int)(Math.random()*101);
  }
  
  int numero=0;
  boolean esta=false;
  int pos=0;
  int contador=1;
  int posi=1;
  

  
  //printeamos el array
  for(int i=0;i<10;i++) {
   System.out.print(n[i] + " ");
  }
  System.out.println();
  //comprobamos si esta el numero 
  do {
   System.out.print("Dime un numero: ");
   numero=s.nextInt();

   for(int i=0;i<10;i++) {
    if(numero==n[i]) {
      esta=true;
      pos=i;
     } 
   }
  }while(esta==false);
  //rotamos
  for(int i=0;i<10;i++) {
   aux[0]=numero;// el numero elegido
  //numeros por delante de elegido
  if(i>pos) {
  aux[posi]=n[i];
  posi++;

}
//numeros por detras del elegido
//123456 elegido 4 desde el 1 hasta el 3 y eso lo rotas hasta el posicion3(4,5,6)
int posi2=posi;
for(int x=0;x<=pos-1;x++) {
  aux[posi2]=n[x];
  posi2++;
}
  }//for
  
  //printeamos el array
  for(int i=0;i<10;i++) {
   System.out.print(aux[i] + " ");
  }
//fin del programa
}
}
    
    /*hecho de nuevo
     *  int[] n=new int[10];
   
   for(int i=0;i<10;i++) {
     n[i]=(int)(Math.random()*101);
   }
   for(int i=0;i<10;i++) {
     System.out.print(n[i] + " ");
   }
  
  
  System.out.print("Dime un numero: ");
  int num=s.nextInt();
  
  
  //pillamos posicion
  int pos=0;
  for(int i=0;i<10;i++) {
    if(n[i]==num) {
      pos=i;
    }
  }
  
  int[] aux=new int[10];
  int post=9-pos;
  
 
    //pos
      aux[0]=n[pos];
    //post
    for(int j=1;j<=post;j++) {
      aux[j]=n[pos+j];
    }
    //pre
    int j=post+1;
    int contadorpre=0;
    for(int i=0;i<9-post;i++) {
      aux[j]=n[contadorpre];
      contadorpre++;
      j++;
    }
    
    for(int i=0;i<10;i++) {
      System.out.print(aux[i] + " ");
    }
  ///fin del programa
}
}


  
 
*/

