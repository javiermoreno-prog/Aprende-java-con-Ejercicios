import java.util.Scanner;
public class ej12 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int[] n=new int[10];
int[] aux=new int[10];

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

//cojer posiciones
System.out.println("Dime posicion inicial: ");
int inicial=s.nextInt();
System.out.println("Dime posicion final: ");
int fin=s.nextInt();

//rotar
for(int i=0;i<10;i++) {
  if(i==fin) {//comprobado
    aux[fin]=n[inicial];
  } else if(i==inicial) {//comprobado
    aux[inicial]=fin;
  } else if((i>=(fin-inicial) && (i<fin))) {//comprobado
    aux[i]=n[i];
  } else {
    if(i==0) {
      aux[0]=n[9];
    }
   if(i>fin) {
     aux[i]=n[i-1];
   } else {
     aux[i+1]=n[i];
   }
   
 }
}

for(int i=0;i<10;i++) {
  System.out.print(aux[i] + " ");
}

//fin del programa
}
}
    
  



