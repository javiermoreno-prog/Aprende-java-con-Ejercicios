
public class funciones {

public static int tamanio(int[] n) {
  int contador=0;
  boolean es=true;
  
  for(int i=0;i<n.length;i++) {
    es=true;
    for(int j=2;j<n[i];j++) {
      if(n[i]%j==0) {
        es=false;
      }
    }
    if(es==true) {
      contador++;
    }
  }
    return contador;
}
public static int[] filtra(int[] n) {
  int lon=tamanio(n);
  int[] aux=new int[lon];
  int[] cero={-1};
  boolean es=true;
  int contador=0;
  
  for(int i=0;i<n.length;i++) {
    es=true;
    for(int j=2;j<n[i];j++) {
      if(n[i]%j==0) {
        es=false;
      }
    }
    if(es==true) {
      aux[contador]=n[i];
      contador++;
    }
  }
  if(contador==0) {
    return cero;
  } else {
    return aux;
 }
}
  
//fin
}
 
