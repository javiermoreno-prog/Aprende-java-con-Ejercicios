public class funcion {

public static int ocurrencias(int digito,int n) {
  int contador=0;
  
  while(n>0) {
    if(n%10==digito) {
      contador++;
    }
    n/=10;
  }
  return contador;
}
public static int ocurrencias(int digito,int[] a) {
  int contador=0;
  boolean encontrado=false;
  int copia=digito;
  
  for(int k=0;k<a.length;k++) {
    digito=copia;
    while(a[k]>0) {
      if(a[k]%10==digito) {
        contador++;
        digito=900000;
      } 
      a[k]/=10;
    
  }
}
return contador;
}
//fin
}
