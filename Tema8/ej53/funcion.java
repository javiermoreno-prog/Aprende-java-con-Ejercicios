public class funcion {

public static int nEsimo(int[][] n,int posicion) {
  int contador=0;
  int elegido=0;
  
  for(int i=0;i<n.length;i++) {
    for(int j=0;j<n[0].length;j++) {
      
    
      if(posicion==contador) {
       elegido=n[i][j];
       contador++;
      } else {
      contador++;
    }
  }
}

return elegido;
}

//fin
}
