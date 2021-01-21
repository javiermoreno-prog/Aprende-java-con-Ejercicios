public class funciones {

public static int[] corteza(int[][] n) {
  int[] res=new int[(n.length*2)+(n[0].length*2-4)];
  int contador=0;
  
  for(int i=0;i<n.length;i++) {
    for(int j=0;j<n[0].length;j++) {
      if(i==0) {
        res[contador]=n[i][j];
        contador++;
      } else if(j==n[0].length-1 && i!=n.length-1) {
         res[contador]=n[i][j];
        contador++;
      } 
    }
  }
   for(int i=n.length-1;i>=0;i--) {
    for(int j=n[0].length-1;j>=0;j--) {
     if(i==n.length-1) {
         res[contador]=n[i][j];
        contador++;
      } else if(j==0 && i!=0) {
        res[contador]=n[i][j];
        contador++;
      }
    }
  }
  
  
  return res;
}

//fin
}
  
