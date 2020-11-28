import java.util.Scanner;
public class ej19 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
    int[] n=new int[12];
  int[] aux=new int[12];
  int j=0;
  int contador=1;
  
  
  for(int i=0;i<12;i++) {
    n[i]=(int)(Math.random()*11);
  }

 for(int i=0;i<12;i++) {
   aux[i]=n[i];
 }
 
  for(int i=0;i<12;i++) {
    System.out.print(n[i] + " ");
  }

  System.out.print("Numero: ");
  int num=s.nextInt();
  System.out.print("Pos: ");
  int pos=s.nextInt();

  for(int i=0;i<12;i++) {
    if(i==pos) {
      j=n[i];
     aux[i]=num;
   } else if((i==pos+contador) && (pos+contador<=11)) {
      if(contador==1) {
        aux[i]=j;
        contador++;
      } else {
      aux[i]=n[i-1];
      contador++;
     }
    } else  {
      aux[i]=n[i];
  }
 }
 System.out.println();
 for(int i=0;i<12;i++) {
  System.out.print(aux[i] + " ");
 }

//fin del programa
 }
}

/*hecho otra vez
 * 
  int[] n=new int[10];
  int[] aux=new int[10];
  
  for(int i=0;i<10;i++) {
    n[i]=(int)(Math.random()*201);
  }
  for(int i=0;i<10;i++) {
    System.out.print(n[i] + " ");
  }
  System.out.println();
  
  System.out.print("Numero: ");
  int num=s.nextInt();
  System.out.print("Posicion: ");
  int pos=s.nextInt();  
  
  for(int i=0;i<10;i++) {
    if(i==pos) {
      aux[i]=num;
    } else if(i<pos) {
      aux[i]=n[i];
    } else {
      aux[i]=n[i-1];
    }
  }
  System.out.println();
  for(int i=0;i<10;i++) {
    System.out.print(aux[i] + " ");
  }
  //fin del programa
}
}
* */
