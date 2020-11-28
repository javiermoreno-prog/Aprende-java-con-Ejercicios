import java.util.Scanner;
public class ej09 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); 
  int[][] n=new int[12][12];
 
  for(int i=0;i<12;i++) {
    for(int j=0;j<12;j++) {
      n[i][j]=(int)(Math.random()*91);
    }
  }
   for(int i=0;i<12;i++) {
    for(int j=0;j<12;j++) {
      System.out.print(n[i][j] + " ");
    }
    System.out.println();
  }
  //variables
  int capa;
  int aux1;
  int aux2;
  
  for(capa=0;capa<6;capa++) {
    //ROTAMOS POR ARRIBA
    aux1=n[capa][11-capa];
    for(int i=11-capa;i>capa;i--) {
      n[capa][i]=n[capa][i-1];
    }
    //ROTAMOS POR LA DERECHA
    aux2=n[11-capa][11-capa];
    for(int i=11-capa;i>capa+1;i--) {
      n[i][11-capa]=n[i-1][11-capa];
    }
   n[capa + 1][11 - capa] = aux1;
    //ROTAMOS POR ABAJO
    aux1 = n[11 - capa][capa];
    for(int i=capa;i<11-capa-1;i++) {
      n[11 - capa][i] = n[11 - capa][i + 1];
    } 
   n[11 - capa][11 - capa - 1] = aux2;
    // rota por la izquierda
   for (int i = capa; i < 11 - capa - 1; i++) {
   n[i][capa] = n[i + 1][capa];
  }
  n[11 - capa - 1][capa] = aux1;
  } // for capa
 System.out.print("array rotado: ");
 System.out.println();
 for(int i=0;i<12;i++) {
    for(int j=0;j<12;j++) {
      System.out.print(n[i][j] + " ");
    }
    System.out.println();
  }
///fin del programa
}
}
