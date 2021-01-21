public class funciones {

//funciones aux
public static int voltea(int x) {
  int res=0;
  
  while(x>0) {
    res+=x%10;
    x/=10;
    res*=10;
  }
  return res/10;
}

public static int cuenta(int[] n) {
  int con=0;
  int volteado=0;
  for(int i=0;i<n.length;i++) {
    volteado=voltea(n[i]);
    if(n[i]%10==volteado%10) {
      con++;
    }
  }
  return con;
}

public static int[] filtra(int[] x) {
  int lon=cuenta(x);
  int[] o=new int[lon];
  int contador=0;
  int volteado=0;
  for(int i=0;i<x.length;i++) {
    volteado=voltea(x[i]);
    if(x[i]%10==volteado%10) {
      o[contador]=x[i];
      contador++;
    }
  }
  return o;
}
//fin
}
