import java.util.Scanner;
public class ej18 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int[] n=new int[10];
int[] aux=new int[10];
int[] menores=new int[10];
int[] mayores=new int[10];
int menor=0;
int mayor=0;

for(int i=0;i<10;i++) {
  n[i]=(int)(Math.random()*201);
  
  if(n[i]>100) {
    menores[menor++]=n[i];
  } else {
    mayores[mayor++]=n[i];
  }
}
  // Muestra el array original
System.out.println("\nArray original:");
System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
System.out.print("│ Índice ");
for (int i = 0; i < 10; i++) {
System.out.printf("│%4d ", i);
}
System.out.println("│");
System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
System.out.print("│ Valor ");
for (int i = 0; i < 10; i++) {
System.out.printf("│%4d ", n[i]);
}
System.out.println("│");
System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

//array resultado
int menoresAsignados=0;
int mayoresAsignados=0;
int j=0;

do {
  if(menoresAsignados<menor) {
    aux[j++]=menores[menoresAsignados++];
  }
  if(mayoresAsignados<mayor) {
    aux[j++]=mayores[mayoresAsignados++];
  }
  
}while(j<10);
  // Muestra el array final
System.out.println("\nArray original:");
System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
System.out.print("│ Índice ");
for (int i = 0; i < 10; i++) {
System.out.printf("│%4d ", i);
}
System.out.println("│");
System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
System.out.print("│ Valor ");
for (int i = 0; i < 10; i++) {
System.out.printf("│%4d ", aux[i]);
}
System.out.println("│");
System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

//fin del programa
}
}

/*hecho de nuevo
 *    int[] n=new int[10];
   
   for(int i=0;i<10;i++) {
     n[i]=(int)(Math.random()*201);
   }
   System.out.println("Array original: ");
   for(int i=0;i<10;i++) {
     System.out.print(i + " ");   
   }
  System.out.println();
   for(int i=0;i<10;i++) {
      System.out.print(n[i] + " ");   
   }
   //creamos los arrays
   int[] menores=new int[10];
   int[] mayores=new int[10];
   int contadorm=0;
   int contadorM=0;
   for(int i=0;i< 10;i++) {
     if(n[i]<100) {
       menores[contadorm]=n[i];
       contadorm++;
     } else {
       mayores[contadorM]=n[i];
       contadorM++;
     }
   }
   
   contadorm=0;
   contadorM=0;
   
   for(int i=0;i<10;i++) {
    if(i%2==0) {
      if(menores[contadorm]==0) {
        n[i]=mayores[contadorM];
        contadorM++;
      } else {
      n[i]=menores[contadorm];
      contadorm++;
     }
    } else {
      if(mayores[contadorM]==0) {
        n[i]=menores[contadorm];
        contadorm++;
      } else {
      n[i]=mayores[contadorM];
      contadorM++;
     }
    }
  }
  
  System.out.println();
  for(int i=0;i<10;i++) {
    System.out.print(n[i] + " ");
  }
   //fin del programa
 }
}
* */
