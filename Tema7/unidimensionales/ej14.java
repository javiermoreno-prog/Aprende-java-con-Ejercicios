import java.util.Scanner;
public class ej14 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

String[] color={"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};

String[] n=new String[8];
String[] aux=new String[8];
String[] aux2=new String[8];
int k=0;
boolean esColor=false;
int z=0;
int j=0;

for(int i=0;i<8;i++) {
  n[i]=s.next();
}

//copia aux
for(int i=0;i<8;i++) {
  aux[i]=n[i];
}

for(int i=0;i<8;i++) {
  z=0;
  esColor=false;
 do {
   if(n[i].equals(color[z])) {
   esColor=true;
 } else {
 z++;
}
} while((esColor==false) && (z<9));

if(esColor==true) {
  aux[j]=n[i];
  j++;
} else {
aux2[k]=n[i];
k++;
} 
}

for(int a=0;a<j;a++) {
  System.out.print(aux[a] + " ");
}
for(int b=0;b<k;b++) {
  System.out.print(aux2[b] + " ");
}
//fin del programa
}
}
/*hecho de nuevo
 * String[] colores={"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
  String[] n=new String[8];
  String[] aux=new String[8];
  int contador=0;
  
  for(int i=0;i<8;i++) {
    n[i]=s.next();
  }
  
  for(int i=0;i<8;i++) {//recorremos n
    for(int j=0;j<9;j++) {//recorremos colores
      if(n[i].equals(colores[j])) {
        aux[contador]=n[i];
        contador++;
      }
    }
  }
  
  boolean esta=false;
  
   for(int i=0;i<8;i++) {//recorremos n
     esta=false;
    for(int j=0;j<9;j++) {//recorremos colores
      if(n[i].equals(colores[j])){
        esta=true;
      }
    }
    if(esta==false) {
      aux[contador]=n[i];
      contador++;
  }
}
    for(int i=0;i<8;i++) {
    System.out.print(aux[i] + " ");
  }
  
  
  
  //fin del programa
}
}

  
*/
