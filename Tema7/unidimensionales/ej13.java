import java.util.Scanner;
public class ej13 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int[] n=new int[100];
int contador=0;
int minimo=500;
int maximo=0;

for(int i=0;i<100;i++) {
  n[i]=(int)(Math.random()*501);
}

for(int i=0;i<100;i++) {
  System.out.print(n[i] + " ");
  contador++;
  if(contador==100) {
    System.out.println();
    contador=0;
  }
  if(n[i]<minimo) {
    minimo=n[i];
  }
  if(n[i]>maximo) {
    maximo=n[i];
  }
}
System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
int respuesta=s.nextInt();

if(respuesta==1) {
  for(int i=0;i<100;i++) {
    if(n[i]==minimo) {
    System.out.print("**" + n[i] + "**");
  contador++;
} else {
   System.out.print(n[i] + " ");
  contador++;
}
  if(contador==100) {
    System.out.println();
    contador=0;
  }
}
} else {
  for(int i=0;i<100;i++) {
    if(n[i]==maximo) {
    System.out.print("**" + n[i] + "**");
  contador++;
} else {
   System.out.print(n[i] + " ");
  contador++;
}
  if(contador==100) {
    System.out.println();
    contador=0;
  }
}  
}
//fin del programa
}
}
