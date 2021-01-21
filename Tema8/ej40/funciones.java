public class funciones {


public static int digitos (int x) {
  int lon=0;
  int copia=x;
  
  while(copia>0) {
    lon++;
    copia/=10;
  }
  return lon;
}

public static int cuenta(int[] n) {
  int dig=0;
  int con=0;
  
  for(int i=0;i<n.length;i++) {
    dig=digitos(n[i]);
    for(int j=0;j<dig;j++) {
      if(n[i]%10==7) {
        con++;
      }
      n[i]/=10;
    }
  }
  return con;
}

public static int[] filtra(int[] n) {
  int lon=cuenta(n);
  int[] aux=new int[lon];
  int contador=0;
  
  for(int i=0;i<n.length;i++) {
    if((n[i]%10)==7) {
      aux[contador]=n[i];
      contador++;
    }
  }
  return aux;
}
  
  
//fin
}
