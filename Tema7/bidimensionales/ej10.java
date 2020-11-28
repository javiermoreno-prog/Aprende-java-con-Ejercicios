import java.util.Scanner;
public class ej10 {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
  //variables
 int[][] tablero=new int[3][3];
 String[][] tableroprint=new String[3][3]; 

 int orX=0;//coordenada x de la tirada del ordenador
 int orY=0;//coordenada y de la tirada del ordenador
 boolean ganado=false;
 
 //rellenamos el tablero
 for(int i=0;i<3;i++) {
   for(int j=0;j<3;j++) {
     tablero[i][j]=0;
   }
 }
 
 

 
 do {
   //copiamos el String 
  for(int i=0;i<3;i++) {
   for(int j=0;j<3;j++) {
     if(tablero[i][j]==0) {
       tableroprint[i][j]=" ";
     } else if(tablero[i][j]==1) {
       tableroprint[i][j]="x";
     } else if(tablero[i][j]==4) {
       tableroprint[i][j]="o";
     }
   }
 } 
 //printeamos el tablero
      System.out.print("┌──┬──┬──┐");
       System.out.println();
   for(int i=0;i<3;i++) {

    if(i>=1) {
      System.out.print("├──┼──┼──┤");
    System.out.println();
    }
    
   for(int j=0;j<3;j++) {
    
    
     System.out.print("│ "+tableroprint[i][j] + "");
   }
   System.out.print("│");
   System.out.println();
 }
 System.out.print("└──┴──┴──┘");
 System.out.println();
 
 
 //preguntamos al jugador
 System.out.println("Coordenada x: ");
 int coorX=s.nextInt(); 
 System.out.println("Coordenada y: ");
 int coorY=s.nextInt();
 tablero[coorX][coorY]=1;
 
 //el ordenador hace su movimiento
 do {
 orX=(int)(Math.random()*3);
 orY=(int)(Math.random()*3);
} while(tablero[orX][orY]!=0);
tablero[orX][orY]=4;

//comprobamos quien gana 
int sumaFila=0;


int i=0;
for(int j=0;j<3;j++) {//filas
  sumaFila+=tablero[i][j];
}
i++;
//columnas
int sumaColumna=0;
int x=0;
int y=0;

for(x=0;x<3;x++) {//columnas
  sumaColumna+=tablero[x][y];
}
y++;

//diagonal2
int diagonal2=0;
int l=0;
int k=0;
for(l=0;l<3;l++) {//diagonal2
  diagonal2+=tablero[l][k];
 k++;
}

//diagonal
int diagonal=0;
int h=2;
int o=0;
for(o=0;o<3;o++) {//diagonal
  diagonal+=tablero[h][o];
 h--;
}


if(sumaFila==3) {
  System.out.print("gana el jugador");
  ganado=true;
} else if(sumaFila>=10) {//no comprobado
 System.out.print("gana el ordenador");
 ganado=true;
}

if(sumaColumna==3) {
  System.out.print("gana el jugador");
  ganado=true;
} else if(sumaColumna>=10) {//no comprobado
 System.out.print("gana el ordenador");
 ganado=true;
}

if(diagonal2==3) {
  System.out.print("gana el jugador");
  ganado=true;
} else if(diagonal2>=10) {//no comprobado
 System.out.print("gana el ordenador");
 ganado=true;
}


if(diagonal==3) {
  System.out.print("gana el jugador");
  ganado=true;
} else if(diagonal>=10) {//no comprobado
 System.out.print("gana el ordenador");
 ganado=true;
}



}while(ganado==false);
 ///fin del programa
}
}
/*rehecho mejor
 *   
  int[][] n=new int[3][3];
    
     
  for(int i=0;i<3;i++) {
    for(int j=0;j<3;j++) {
      n[i][j]=0;
    }
  }
  
   String[][] tableroprint=new String[3][3]; 

  
  
   boolean ganador=false;
  
   do {
    //copiamos el String 
  for(int i=0;i<3;i++) {
   for(int j=0;j<3;j++) {
     if(n[i][j]==0) {
       tableroprint[i][j]=" ";
     } else if(n[i][j]==1) {
       tableroprint[i][j]="x";
     } else if(n[i][j]==4) {
       tableroprint[i][j]="o";
     }
   }
 }    
   //printeamos el tablero
      System.out.print("┌──┬──┬──┐");
       System.out.println();
   for(int i=0;i<3;i++) {

    if(i>=1) {
      System.out.print("├──┼──┼──┤");
    System.out.println();
    }
    
   for(int j=0;j<3;j++) {
    
    
     System.out.print("│ "+tableroprint[i][j] + "");
   }
   System.out.print("│");
   System.out.println();
 }
 System.out.print("└──┴──┴──┘");
 System.out.println();
  
   //dime posicion 
   System.out.println("Dime la posicion x: ");
   int posX=s.nextInt();
   System.out.println("Dime la posicion y: ");
   int posY=s.nextInt();
   //colocamos el numero
   n[posX][posY]=1;
   //ordenador
   int X=0;
   int Y=0;
   
  
   do {
     X=(int)(Math.random()*3);
     Y=(int)(Math.random()*3);
   } while(n[X][Y]!=0);
    n[X][Y]=4;
    
   //comprobamos si alguien a ganado
   //filas
  
   int fila=0;
   
   for(int uno=0;uno<3;uno++) {
     fila=0;
    for(int dos=0;dos<3;dos++) {
     fila+=n[uno][dos];
     }
    if(fila==3) {
       System.out.print("El ganador es el jugador");
       ganador=true;
      } 
       if(fila>=10) {
       System.out.print("El ganador es ordenador");
       ganador=true;
     
     }  
    }
   //columnas
   int columna=0;
   for(int uno=0;uno<3;uno++) { 
     columna=0;
     for(int dos=0;dos<3;dos++) {
       columna+=n[dos][uno];
     }
     if(columna==3) {
       System.out.print("El ganador es el jugador");
       ganador=true;
      } 
       if(columna>=10) {
       System.out.print("El ganador es ordenador");
       ganador=true;
     
     }  
   }
   //diagonal izquierda
   int izquierda=0;
   int dos=0;
   int uno=0;
   for(int i=0;i<3;i++) {
      izquierda+=n[uno][dos];
      uno++;
      dos++;
    }
   if(izquierda==3) {
       System.out.print("El ganador es el jugador");
       ganador=true;
      } 
       if(izquierda>=10) {
       System.out.print("El ganador es ordenador");
       ganador=true;
     
     }  
  //diagonal derecha
   int derecha=0;
    dos=2;
    uno=0;
   for(int i=0;i<3;i++) {
      derecha+=n[uno][dos];
      uno++;
      dos--;
    }
   if(derecha==3) {
       System.out.print("El ganador es el jugador");
       ganador=true;
      } 
       if(derecha>=10) {
       System.out.print("El ganador es ordenador");
       ganador=true;
     
     }  
 
     

  } while(ganador==false);
   
   
   
  ///fin del programa
}
}


 * */
