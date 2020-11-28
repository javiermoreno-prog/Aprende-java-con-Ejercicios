import java.util.Scanner;
public class ej08 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); 
//variables
int[][] cuadrante=new int[8][8];
boolean vacio=true;
String[][] respuesta=new String[8][8];

//inicializamos el array
for(int i=0;i<8;i++) {
  for(int j=0;j<8;j++) {
    cuadrante[i][j]=i;
  }
}



System.out.println("Dime la posicion x del alfil: ");
int posX=s.nextInt();
System.out.println("Dime la posicion x del alfil: ");
int posY=s.nextInt();




//inicializamos la respuesta
for(int i=0;i<8;i++) {
  for(int j=0;j<8;j++) {
    respuesta[i][j]= " ";
  }
}
//printeamos la respuesta

System.out.print("┌──┬──┬──┬──┬──┬──┬──┬──┐");
System.out.println();
for(int i=0;i<8;i++) {
  if(i>=1) {
      System.out.print("├──┼──┼──┼──┼──┼──┼──┼──┤");
    System.out.println();
    }
  for(int j=0;j<8;j++) {
  if(cuadrante[i][j]<8) {
    if((i==posX) && (j==posY)) {
      System.out.print("│ a");
    } else {
   System.out.print("│ "+cuadrante[i][j] + "");
  }
 }
 
}

 System.out.print("│");
 System.out.println();
}
System.out.print("└──┴──┴──┴──┴──┴──┴──┴──┘");
 System.out.println();
///comprobamos las posiciones
//izquierda
int copia=posX;
int copiaaux=posX;
int copia2=posY;
//inferior
int copia3=posX;
int copiaaux2=posX;
int copia4=posY;
//derecha
int copia5=posX;
int copiaaux3=posX;
int copia6=posY;
//inferior2
int copia7=posX;
int copiaaux4=posX;
int copia8=posY;
//diagonal izquierda

int[] diagonalIzquierda=new int[8];
int k=0;
copia=posX;
copia2=posY;
          
     for(k=0;k<8;k++) {
       if((copia<0) && (copia2<0)) {
         System.out.print("");
       } else if((copia<0) && (copia2>=0)) {
        System.out.print("");
       } else if((copia>=0) && (copia2<0)) {
        
         System.out.print("");
       } else {
    diagonalIzquierda[k]=cuadrante[copia--][copia2--];
 }
}
  
//diagonal inferior

int[] diagonalInferior=new int[8];
int a=0;
copia3=posX;
copia4=posY;
copiaaux2=posX;
          
     for(a=0;a<8;a++) {
       if((copia3>7) && (copia4<0)) {
         System.out.print("");
       } else if((copia3>7) && (copia4>=0)) {
        System.out.print("");
       } else if((copia3<7) && (copia4<0)) {
         System.out.print("");
       } else {
    diagonalInferior[a]=cuadrante[copia3++][copia4--];
 }
}

//diagonal inferior derecha
int[] diagonalInferior2=new int[8];
int b=0;
 copia5=posX;
 copiaaux3=posX;
 copia6=posY;
 
 for(b=0;b<8;b++) {
       if((copia5>7) && (copia6>7)) {
         System.out.print("");
       } else if((copia5>7) && (copia6<=7)) {
        System.out.print("");
       } else if((copia5<=7) && (copia6>7)) {
         System.out.print("");
       } else {
    diagonalInferior2[b]=cuadrante[copia5++][copia6++];
 }
}


//diagonal superior derecha
int[] diagonalDerecha=new int[8];
int c=0;
  copia7=posX;
  copiaaux4=posX;
  copia8=posY;
 
 for(c=0;c<8;c++) {
       if((copia7<0) && (copia8>7)) {
         System.out.print("");
       } else if((copia7>=0) && (copia8>7)) {
        System.out.print("");
       } else if((copia7<0) && (copia8<=7)) {
         System.out.print("");
       } else {
    diagonalDerecha[c]=cuadrante[copia7--][copia8++];
 }
}


//printeamos datos
System.out.println();
System.out.print("Las posiciones posibles: ");
System.out.println();
for(int i=0;i<8;i++) {
  System.out.print(diagonalIzquierda[i] + " ");
  
}
System.out.println();
for(int i=0;i<8;i++) {
  System.out.print(diagonalInferior[i] + " ");
  
}
System.out.println();
for(int i=0;i<8;i++) {
  System.out.print(diagonalInferior2[i] + " ");
  
}
System.out.println();
for(int i=0;i<8;i++) {
  System.out.print(diagonalDerecha[i] + " ");
  
}





///fin del programa
}
}
/*hecho de nuevo
 * import java.util.Scanner;
public class ej08denuevo {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
  int[][] n=new int[8][8];
  

  //colocamos el alfil
  System.out.print("Dime x: ");
  int posX=s.nextInt();
  System.out.print("Dime y: ");
  int posY=s.nextInt();  
  
  for(int i=0;i<8;i++) {
    for(int j=0;j<8;j++) {
      if((i==posX) && (j==posY)) {
      n[i][j]=1;
    } else {  
      n[i][j]=(int)(Math.random()*20);
     }
    }
  } 
  //mostramos
   for(int i=0;i<8;i++) {
    for(int j=0;j<8;j++) {
      System.out.print(n[i][j] + " ");
    }
    System.out.println();
  }
  ///posibles posiciones
  //diagonal superior izquierda
  int contador=0;
  int[] DSI=new int[10];
  int o=posX;
  int p=posY;
  int mayor=p;
  
  //comprobar cual es mayor
  if(o>p) {
  mayor=o;
}
  //vamos rellenando DSI
  boolean primera=false;
  for(int i=0;i<mayor;i++) {
    if(((o==0) || (p==0)) || (primera!=true)) {
      DSI[contador]=n[o][p];
      
      primera=true;
    } else {
    DSI[contador]=n[o][p];
    o--;
    p--;
    contador++;
  }
}

//diagonal inferior izquierda
contador=0;
int[] DII=new int[10];
o=posX;
p=posY;
int menor=p;
//comprobar cual es mayor
  if(o<p) {
  menor=o;
}

 for(int i=0;i<menor;i++) {
    
    DII[contador]=n[o][p];
    o++;
    p--;
    contador++;
  }

   System.out.println();
//diagonal inferior derecha
contador=0;
int[] DID=new int[10];
o=posX;
p=posY;
mayor=p;
 //comprobar cual es mayor
  if(o>p) {
  mayor=o;
}
int espacios=8-mayor;

 for(int i=0;i<espacios;i++) {
  if((o>7) || (p>7)) {
    System.out.print("");
  } else {
     DID[contador]=n[o][p];
     contador++;
     o++;
     p++;
   }
 }
 //diagonal superior derecha
 contador=0;
 int[] DSD=new int[10];
 o=posX;
 p=posY;
 
 for(int i=0;i<10;i++) {
   if((o==0) || (p==7)) {
     DSD[contador]=n[o][p];
     contador++;
   } else {
     DSD[contador]=n[o][p];
     contador++;
     o--;
     p++;
   }
 }
  
///mostramos las soluciones
  for(int i=0;i<mayor;i++) {
    System.out.print(DSI[i] + " ");
  }
  System.out.println();
  for(int i=0;i<menor;i++) {
    System.out.print(DII[i] + " ");
  }
  System.out.println();
  for(int i=0;i<espacios;i++) {
    System.out.print(DID[i] + " ");
  }
   System.out.println();
  for(int i=0;i<espacios;i++) {
    System.out.print(DSD[i] + " ");
  }
  ///fin del programa
}
}

*/

