import java.util.Scanner;
public class ej15 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int[] mesas=new int[10];
int opcion=0;
int minimo=100000;

//rellenamos el array
for(int i=0;i<10;i++) {
  mesas[i]=(int)(Math.random()*4);
}
do {
  minimo=1000;
  //mostramos el array
  //primera linea
  System.out.print("Mesa: ");
  for(int i=1;i<=10;i++) {
    System.out.printf("%3d",i);
  }
  System.out.println();
  //segunda linea
  System.out.print("Ocupacion: ");
  for(int i=0;i<10;i++) {
    System.out.printf("%3d",mesas[i]);
  }
  System.out.println();
  //cojemos el minimo
  for(int i=0;i<10;i++) {
    if(mesas[i]<minimo) {
      minimo=mesas[i];
    }
  }
  //preguntamos
  System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
  opcion=s.nextInt();
  if(opcion>4) {
    System.out.print("no");
    opcion=-1;
  } else if(opcion==-1) {
    System.out.print("Adios");
  } else {
    for(int i=0;i<10;i++) {
      if(mesas[i]==0) {//if n[i]=0
        mesas[i]+=opcion;
        opcion=0;
      } else  if(mesas[i]==minimo){//minimo
        if((mesas[i]+=opcion)>4) {
          System.out.print("Estamos llenos");
          opcion=-1;
        } else {
        opcion=0;
      }
    }
    }//for
  }//else de opcion=-1
}while(opcion!=-1);

//fin del programa
}
}
/*rehecho puede que mejor
 *  int[] n=new int[10];
 
 for(int i=0;i<10;i++) {
   n[i]=(int)(Math.random()*4);
 }
 
 int opcion=0;
 
 do {
 for(int i=0;i<10;i++) {
   System.out.print(n[i] + " ");
 }
 System.out.println();
 do {
 System.out.print("Cuantos son: ");
   opcion=s.nextInt();
 }while(opcion>4);
 
 //recorremos en busca de 0

 int contador=0;
 boolean cero=false;
 
 for(int i=0;i<10;i++) {
   if((n[i]==0) && (contador==0)) {
     n[i]+=opcion;
     contador++;
     cero=true;
   }
 }
 //recorremos en busca del mas pequeño 
 if(cero==false) {
   contador=0;
 for(int i=0;i<10;i++) {
   if(((n[i]+opcion)<=4) && (contador==0)) {
     n[i]+=opcion;
     contador++;
   }
 }
}
   
 } while(opcion!=-1);
  System.out.print("Gracias.Hasta pronto");
  //fin del programa
}
}
* */
